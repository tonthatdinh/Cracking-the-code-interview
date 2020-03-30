package StackandQueue;

public class LinkedStackofStrings{
    private class Node{
        private String item;
        private Node next;
    }

    private Node first = null;

    public boolean isEmpty(){
        return first == null;
    }

    public void push(String item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop(){
        String item = first.item;
        first = first.next;
        return item;
    }
}
