package LinkedListImpementation;

public class LinkedList {
    //The first thing which we need to do is create the node class
    public static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //The second thing we need to do is create the head
    Node head;

    public static void main(String args[])
    {
        //The first thing we need to do is create linked list and attach the head to this linked list\
        LinkedList list = new LinkedList();
        list.head = new Node(1);

        //The next step is to define ṭhe next two nodes along with their data elements
        Node second = new Node(2);
        Node third = new Node(3);

        //The next step is to attach the next elements to these Nodes
        list.head.next = second;
        second.next = third;
        third.next = null;
    }
}
