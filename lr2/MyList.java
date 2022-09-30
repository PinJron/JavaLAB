public class MyList {
    public class Node {
        public Object data;
        public Node nextNode = null;
    
        public Node() {}
    
        public Node(int data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
    
        }
        public Node(Object _data){
            this.data = _data;
        }
    
        public void display() {  
            System.out.println(this.data + "" + this.nextNode); // Функция печати узла
        }
    }
      
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
            countElements = 1;
            return;
        }
        lastElement.nextNode = newnode;
        lastElement = newnode;
        countElements++;
    }

    public void insertHead(Object val) {
        Node newnode = new Node(val);
        if (isEmpty()) {
            firstElement = newnode;
            lastElement = newnode;
            countElements = 1;
            return;
        }
        newnode.nextNode = firstElement;
        firstElement = newnode;
        countElements++;
    }

    public void removeHead() throws Exception {
        if (isEmpty()) {
            throw new Exception("null list");
        }
        firstElement = firstElement.nextNode;
        countElements--;
    }

    public void removeTail() throws Exception {
        if (isEmpty()) {
            throw new Exception("null list");
        }
        Node node = firstElement;
        while (node.nextNode != lastElement) {
            node = node.nextNode;
        }
        node.nextNode = null;
        lastElement = node;
        countElements--;
    }

    public void removeByIndex(int index) throws Exception {
        if (index < 0 || index > countElements) {
            throw new Exception("Index out of range");
        }
        if (index == 0) {
            removeHead();
            return;
        }
        Node node = firstElement;
        for(int i = 0; i < index - 1; i++) {
            node = node.nextNode;
        }
        node.nextNode = node.nextNode.nextNode;
        countElements--;
    }

    public void removeByValue(Object val) throws Exception {
        if (isEmpty()) {
            throw new Exception("null list");
        }
        Node node = firstElement;
        if (node.data == val) {
            removeHead();
            return;
        }
        while (node.nextNode != null) {
            if (node.nextNode.data == val) {
                node.nextNode = node.nextNode.nextNode;
                countElements--;
                return;
            }
            node = node.nextNode;
        }
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

    public Object getByIndex(int index) throws Exception {
        if (index < 0 || index > countElements) {
            throw new Exception("Index out of range");
        }
        
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

    public String print() throws Exception {
        Node p = firstElement;
        if (p == null) {
            throw new Exception("null list");
        } else {
            System.out.println(p.data);
        }
        while (p.nextNode != null) {
            p = p.nextNode;
            System.out.println(p.data);
        }
        return null;
    }

    // public String toString() {
    //     return firstElement.data + " " + firstElement.nextNode;
    // }          
}
