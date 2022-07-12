package practice.july12.linkedlist;

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
        System.out.println("Initial List is: ");
        list.traversal();
        System.out.println("List after adding an element to the head is: ");
        list.addToHead(4);
        list.traversal();
    }

    public void addToHead(int new_data)
    {
        if(head == null)
        {
            Node new_node = new Node(new_data);
            new_node.next = null;
            head = new_node;
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void traversal()
    {
        Node n = head;
        while(n!= null)
        {
            System.out.print(n.data+"  ");
            n = n.next;
        }
        System.out.println();
    }
}
