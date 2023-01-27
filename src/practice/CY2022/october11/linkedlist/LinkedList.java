package practice.CY2022.october11.linkedlist;

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
        System.out.println("Initial LinkedList is: ");
        list.traversal();
        System.out.println("Adding element to the head");
        list.addToHead(0);
        list.traversal();
        System.out.println("Adding element to a position");
        list.addToPosition(second,3);
        list.traversal();
    }

    public void addToPosition(Node prev_Node, int element)
    {
        if(prev_Node == null)
        {
            System.out.println("Previous Node cannot be null");
            return;
        }
        Node new_Node = new Node(element);
        new_Node.next = prev_Node.next;
        prev_Node.next = new_Node;
    }

    public void addToHead(int element)
    {
        if(head == null)
        {
            head = new Node(element);
            head.next = null;
            return;
        }
        Node new_Node = new Node(element);
        new_Node.next = head;
        head = new_Node;
    }

    public void traversal()
    {
        Node n = head;
        while(n != null)
        {
            System.out.print(n.data +" ");
            n = n.next;
        }
        System.out.println();
    }
}
