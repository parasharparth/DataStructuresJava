package practice.CY2022.october19.linkedlist;

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
        list.traversal();
        list.addToHead(0);
        list.traversal();
        list.addToNode(3,second);
        list.traversal();
        list.addToTail(5);
        list.traversal();
        list.deleteFromHead();
        list.traversal();
        list.deleteFromTail();
        list.traversal();
    }

    public void deleteFromTail()
    {
        System.out.println("Deleting from tail");
        if(head == null)
        {
            System.out.println("Cannot delete from empty list");
            return;
        }
        Node tail = head.next;
        Node n = head;
        while(tail.next != null)
        {
            n = n.next;
            tail = tail.next;
        }
        n.next = null;
    }

    public void deleteFromHead()
    {
        System.out.println("Deleting from head");
        if(head == null)
        {
            System.out.println("Cannot delete from empty list");
            return;
        }
        head = head.next;
    }

    public void traversal()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+ " ");
            n = n.next;
        }
        System.out.println();
    }

    public void addToHead(int new_element)
    {
        System.out.println("Adding to head");
        if(head == null)
        {
            head = new Node(new_element);
            return;
        }
        Node new_node = new Node(new_element);
        new_node.next = head;
        head = new_node;
    }

    public void addToNode(int new_data,Node prev)
    {
        System.out.println("Adding to position");
        if(prev == null)
        {
            System.out.println("Previous Node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev.next;
        prev.next = new_node;
    }

    public void addToTail(int new_data)
    {
        System.out.println("Adding to the tail");
        if(head == null)
        {
            head = new Node(new_data);
            head.next = null;
        }
        Node n = head;
        while(n.next!=null)
        {
            n = n.next;
        }
        //System.out.println(n.data);
        n.next = new Node(new_data);
        n.next.next = null;
    }
}
