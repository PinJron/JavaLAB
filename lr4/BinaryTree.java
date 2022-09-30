public class BinaryTree {
    public class Node {
        private int value; // ключ узла
        private Node leftChild; // Левый узел потомок
        private Node rightChild; // Правый узел потомок
     
        public void printNode() { // Вывод значения узла в консоль
            System.out.println(" Выбранный узел имеет значение : " + value);
        }
     
        public int getValue() {
            return this.value;
        }
     
        public void setValue(final int value) {
            this.value = value;
        }
     
        public Node getLeftChild() {
            return this.leftChild;
        }
     
        public void setLeftChild(final Node leftChild) {
            this.leftChild = leftChild;
        }
     
        public Node getRightChild() {
            return this.rightChild;
        }
     
        public void setRightChild(final Node rightChild) {
            this.rightChild = rightChild;
        }
     
        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }

    private Node rootNode;
    private int size;

    public BinaryTree() {
        rootNode = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Node findNodeByValue(int value) {
        Node currentNode = rootNode;
        while (currentNode.getValue() != value) {
            if (value < currentNode.getValue()) {
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
    
    public void insertNode(int value) {
        Node newNode = new Node(); 
        newNode.setValue(value);
        if (rootNode == null) {
            rootNode = newNode;
            size++;
        }
        else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true)
            {
                parentNode = currentNode;
                if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null){
                        parentNode.setLeftChild(newNode);
                        size++;
                        return;
                    }
                }
                else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(newNode); 
                        size++; 
                        return;
                    }
                }
            }
        }
    }
}
