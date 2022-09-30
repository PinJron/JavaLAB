class MainMyVector{
    public static void main(String[] argc) throws Exception {
        MyVector<Integer> vec = new MyVector<Integer>(4);
        vec.addLast(3);
        vec.addLast(5);
        vec.addLast(6);
        vec.insertByIndex(10, 3);
        System.out.println(vec);
    }
}