package practice.CY2023.january.jan27;

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
        Node third = new Node(4);
        list.head.next = second;
        second.next = third;
        third.next = null;
        list.traversal();
        list.addToHead(0);
        list.addToTail(5);
        list.traversal();
//        list.deleteFromHead();
//        list.deleteFromTail();
//        list.traversal();
    }

    public void traversal()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
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

    public void addToTail(int new_data)
    {
        if(head == null)
        {
            Node new_node = new Node(new_data);
            new_node.next = null;
            head = new_node;
            return;
        }
        Node new_node = new Node(new_data);
        Node n = head;
        while(n.next != null)
        {
            n = n.next;
        }
        n.next = new_node;
        new_node.next = null;
    }
}
