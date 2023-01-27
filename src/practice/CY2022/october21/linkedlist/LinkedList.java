package practice.CY2022.october21.linkedlist;

public class LinkedList {

    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
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
        list.traversal();
        list.addToHead(0);
        list.traversal();
    }

    void addToHead(int element)
    {
        if(head == null)
        {
            Node n = new Node(element);
            n.next = null;
            return;
        }
        Node n = new Node(element);
        n.next = head;
        head = n;
    }
    void traversal()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data +" ");
            n = n.next;
        }
        System.out.println();
    }
}
