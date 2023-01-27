package practice.CY2022.august19.linkedList;

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
        System.out.println("Initial list");
        list.traversal();
        System.out.println("Adding element to the head");
        list.addToHead(0);
        list.traversal();
        System.out.println("Adding element to the tail");
        list.addToTail(4);
        list.traversal();
        System.out.println("Adding an element");
        list.addToPosition(5, second);
        list.traversal();
        System.out.println("Delete from head");
        list.deleteFromHead();
        list.traversal();
        System.out.println("Delete from position");
        list.deleteFromPosition(second);
        list.traversal();
    }

    public void deleteFromPosition(Node to_be_deleted)
    {

    }

    public void deleteFromHead()
    {
        if(head == null)
        {
            System.err.println("Cannot delete from the head of the list");
            return;
        }
        head = head.next;
    }
    public void addToPosition(int new_data, Node prev)
    {
        if(head == null)
        {
            System.err.println("Head cannot be null");
            return;
        }
        if(prev == null)
        {
            System.err.println("The previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev.next;
        prev.next = new_node;
    }

    public void addToTail(int new_data)
    {
        if(head == null)
        {
            Node n = new Node(new_data);
            n.next = null;
            head = n;
        }
        Node n = head;
        while(n.next!=null)
        {
            n = n.next;
        }
        n.next = new Node(new_data);
    }

    public void addToHead(int new_data)
    {
        if(head == null)
        {
            Node n = new Node(new_data);
            n.next = null;
            head = n;
            return;
        }
        Node n = new Node(new_data);
        n.next = head;
        head = n;
    }

    public  void traversal()
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
