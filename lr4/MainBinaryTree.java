class MainBinaryTree{
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        // вставляем узлы в дерево:
        tree.add(6);
        tree.add(8);
        tree.add(5);
        tree.add(8);
        tree.add(2);
        tree.add(9);
        tree.add(7);
        tree.add(4);
        tree.add(10);
        tree.add(3);
        tree.add(1);

        
        BinaryTree<Integer> tree1 = new BinaryTree<>(tree);
        // tree.traverseInOrder(null);
        
        System.out.println("tree " + tree.getSize());

        tree1.add(11);
        
        // находим узел по значению и выводим его в консоли
        BinaryTree<Integer>.Node foundNode = tree.findNodeByValue(9);
        foundNode.printNode();
        BinaryTree<Integer>.Node foundNode1 = tree1.findNodeByValue(8);
        foundNode1.printNode();

        // tree1.clearTree();
        // BinaryTree.Node foundNode2 = tree1.findNodeByValue(9);
        // foundNode2.printNode();
    }
}
