package LinkedList;

public class Node{
    int info;
    Node next;

    public Node(int info, Node next) {
        this.info = info;
        this.next = next;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
