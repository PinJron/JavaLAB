package MyList;

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