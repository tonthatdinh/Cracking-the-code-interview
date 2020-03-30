package LinkedList;

class LinkedList{
    Node head;
    Node tail;

    public LinkedList() {
        this.head = this.tail = null;
    }

    public void addNode(Node p){
        if (this.head == null){
            this.head = p;
            this.tail = p;
            return;
        }
        tail.next = p;
        tail = p;
    }

    /**
     * 2.1 Write code to remove duplicate from an unsorted linked list
     * Ex1: 1, 2, 3, 2, 4 --> 1, 2, 3.
     * Ex2: 2, 1, 2, 1, 1 --> 2, 1.
     * idea:
     * Let p1 iterate all list
     *      Let p2 iterate all list
     *      if p2.next.info == p1.info (it means that p2.next == p1 --> duplicate)
     *      then remove p2.next
     */

    public void removeDuplicate(){
        Node p1 = head;
        Node p2 = head;
        while (p1 != tail){
            p2 = p1;
            while (p2 != tail && p2.next.info != p1.info){
                if (p2.next.info == p1.info)
                    continue;
                p2 = p2.next;
            }
            if (p2 != tail && p2.next.info == p1.info)
                p2.next = p2.next.next; //remove
            p1 = p1.next;
        }
    }

    /**
     * 2.2. Implement an algorithm to find the n th last element of a singly linked list
     * Pseudocode:
     *
     *
     */
    public void findNthLastElement(){

    }
    /**
     * Print List of Linked List
     */
    public void printList(){
        Node p = this.head;
        while (p != null){
            System.out.print(p.info + " ");
            p = p.next;
        }
        System.out.println("\n");
    }

    /**
     * 2.4. You have two number represented by a linked list, where each node contains a single digit.
     * The digits are store in revers order, such that the 1's digit is at the head of the list
     * Write a function that adds the two numbers and returns the sum as a linked list
     *
     */


    /**
     * 2.5. Given a circular linked list, implement an algorithm which returns node at the begining of the loop.
     * Def:
     * Circular linked list:
     */

}

/**
 * 2.1 Write code to remove duplicate from an unsorted linked list
 * Ex1: 1, 2, 3, 2, 4 --> 1, 2, 3.
 * Ex2: 2, 1, 2, 1, 1 --> 2, 1.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Node node = new Node(1, null);
        Node node1 = new Node(2, null);
        LinkedList linkedList = new LinkedList();

        linkedList.addNode(new Node(1, null));
        linkedList.addNode(new Node(2, null));
        linkedList.addNode(new Node(3, null));
        linkedList.addNode(new Node(2, null));
        linkedList.addNode(new Node(4, null));
        linkedList.printList();
        linkedList.removeDuplicate();
        linkedList.printList();
    }
}
