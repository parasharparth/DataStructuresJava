package practice.CY2022.july13;

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
        second.next= third;
        System.out.println("Initial list: ");
        list.traversal();
        System.out.println("Adding element to the head");
        list.addToHead(10);
        list.traversal();
        System.out.println("Adding element to the tail");
        list.addToTail(11);
        list.traversal();
        System.out.println("Removing element from the head");
        list.removeFromHead();
        list.traversal();
        System.out.println("Removing element from the tail");
        list.removeFromTail();
        list.traversal();
    }

    public void removeFromTail()
    {
        if(head == null)
        {
            System.err.println("Cannot remove from an empty list");
            return;
        }
        Node last = head.next;
        Node second_last = head;
        while(last.next!= null)
        {
            last = last.next;
            second_last = second_last.next;
        }
        second_last.next = null;
    }

    public void removeFromHead()
    {
        if(head == null)
        {
            System.err.println("Cannot remove from empty list");
            return;
        }
        head = head.next;
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
        Node last = head;
        while(last.next!=null)
        {
            last = last.next;
        }
        last.next = new_node;
        new_node.next = null;
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
        while(n != null)
        {
            System.out.print(n.data+"  ");
            n=n.next;
        }
        System.out.println();
    }
}
