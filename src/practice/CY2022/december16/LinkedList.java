package practice.CY2022.december16;

public class LinkedList {

    public static class Node
    {
        int data;
        Node next;
        Node(int element)
        {
            data = element;
            next = null;
        }
    }

    Node head;

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;
        third.next = null;
    }
}
