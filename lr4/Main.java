class Main{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // вставляем узлы в дерево:
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(3);
        tree.insertNode(1);
        System.out.println(tree.getSize());
     
        // находим узел по значению и выводим его в консоли
        BinaryTree.Node foundNode = tree.findNodeByValue(9);
        foundNode.printNode();
    }
}