class MainMyList{
    public static void main(String[] argc) throws Exception {
        MyList list = new MyList();
        list.insertHead(5);
        list.insertHead("spisok");
        list.insertTail(32);
        list.insertTail(1320);
        list.removeByValue("spisok");
        list.print();
    }
}