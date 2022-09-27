import MyList.*;

class Program{
    public static void main(String[] argc) {
        MyList list = new MyList();
        list.insertHead(5);
        list.insertHead("spisok");
        list.insertTail(32);
        list.insertTail(132);
        System.out.println("Element 2" + list.selectByIndex(2));
        list.print();
        System.out.println("\n");
        MyList list_2 = new MyList(list);
        System.out.println("dlina = " + list.getLenght(list));
        list_2.print();
        list_2.deleteList();
        list_2.print();


    }
}