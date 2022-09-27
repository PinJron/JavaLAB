package MyList;

public class MyList {
    public Node firstElement;
    public Node lastElement;
    public int countElements;

    public MyList(){};

    public MyList(Node fe, Node se, int len) {
        this.countElements   = len;
        this.firstElement = fe;
        this.lastElement  = se;

    }

    //copy constructor
    public MyList(MyList another_list){
        this(another_list.firstElement, another_list.lastElement, another_list.countElements);
    }

    boolean isEmpty() {
        return firstElement == null;
    }

    public void insertTail(Object val) {
        Node newnode = new Node(val);
        if (isEmpty()) {
            firstElement = newnode;
            lastElement = newnode;
            return;
        }
        lastElement.nextNode = newnode;
        lastElement = newnode;
    }

    public void insertHead(Object val) {
        Node newnode = new Node(val);
        if (isEmpty()) {
            firstElement = newnode;
            lastElement = newnode;
            return;
        }
        newnode.nextNode = firstElement;
        firstElement = newnode;
    }

    public int getLenght(MyList list) {
        countElements = 0;
        Node node = firstElement;
        while (node != null){
            node = node.nextNode;
            countElements++;
        }
        return countElements;
    }

    public String print(){
        Node p = firstElement;
        if (p == null) {
            System.out.println("Empty List");
            return null;
        } else {
            System.out.println(p.data);
        }
        while (p.nextNode != null) {
            p = p.nextNode;
            System.out.println(p.data);
        }

        return null;
    }

    public Object selectByIndex(int index) {
        Node node = firstElement;

        for(int i = 0; i < index - 1; i++) {
            node = node.nextNode;
        }
        return node.data;
    }

    public void deleteList() {
        firstElement = null;
        lastElement = null;
        countElements = 0;
    }

    // public String toString() {
    //     return firstElement.data + " " + firstElement.nextNode;
    // }          
}