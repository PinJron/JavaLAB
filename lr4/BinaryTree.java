public class BinaryTree<T extends Comparable<T>> {
    public class Node {
        private T value; // ключ узла
        private Node left; // Левый узел потомок
        private Node right; // Правый узел потомок

        Node(T value) {
            this.value = value;
            right = null;
            left = null;
        }
     
        public void printNode() { // Вывод значения узла в консоль
            System.out.println(" Выбранный узел имеет значение : " + value);
        }
     
        public T getValue() {
            return this.value;
        }
     
        public void setValue( T value) {
            this.value = value;
        }
     
        public Node getLeftChild() {
            return this.left;
        }
     
        public void setLeftChild( Node leftChild) {
            this.left = leftChild;
        }
     
        public Node getRightChild() {
            return this.right;
        }
     
        public void setRightChild(final Node rightChild) {
            this.right = rightChild;
        }
     
        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", leftChild=" + left +
                    ", rightChild=" + right +
                    '}';
        }
    }

    Node root;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public BinaryTree(BinaryTree<T> _tree) {
        this.root = _tree.root;
        this.size = _tree.size;
    }

    public int getSize() {
        return size;
    }

    public Node findNodeByValue(T value) {
        Node currentNode = root;
        while (currentNode.getValue() != value) {
            int res = value.compareTo(currentNode.getValue());
            if (res < 0) {
                currentNode = currentNode.getLeftChild();
            } else { //движение вправо
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) { // если потомка нет,
                return null; // возвращаем null
            }
        }
        return currentNode; // возвращаем найденный элемент
    }
    
    // public void traverseInOrder(Node node) {
    //     node = root;
    //     if (node != null) {
    //         traverseInOrder(node.getLeftChild());
    //         System.out.print(" " + node.value);
    //         traverseInOrder(node.getRightChild());
    //     }
    // }

    private Node addRecursive(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }
        int res = value.compareTo(current.getValue());

        if (res < 0) {
            current.left = addRecursive(current.left, value);
        } else if (res > 0) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
    }

    public void add(T value) {
        root = addRecursive(root, value);
        size++;
    }

    public void clearTree() {
        root = null;
        size = 0;
    }
}
