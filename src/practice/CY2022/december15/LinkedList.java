package practice.CY2022.december15;

public class LinkedList {

    public static class Node
    {
        Node next;
        int data;
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
        list.traversal();
    }

    public void traversal()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
}
