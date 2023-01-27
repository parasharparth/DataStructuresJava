package practice.CY2022.december25;

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
        third.next = null;
        list.traversal();
    }

    void traversal() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println();
    }
}
