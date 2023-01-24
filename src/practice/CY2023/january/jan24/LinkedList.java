package practice.CY2023.january.jan24;

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
        list.addToHead(0);
        list.addToTail(5);
        list.addToPosition(third,4);
        list.traversal();
        list.deleteFromHead();
        list.deleteFromTail();
        list.traversal();
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
            head = new Node(new_data);
            head.next = null;
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
            head = new Node(new_data);
            head.next = null;
            return;
        }
        Node new_node = new Node(new_data);
        Node n = head;
        while (n.next != null)
        {
            n = n.next;
        }
        n.next = new_node;
        new_node.next = null;
    }

    public void addToPosition(Node prev_node, int new_data)
    {
        if(prev_node == null)
        {
            System.out.println("Cannot add");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void deleteFromHead()
    {
        if(head == null)
        {
            return;
        }
        head = head.next;
    }

    public void deleteFromTail()
    {
        if(head == null)
        {
            return;
        }
        Node n = head;
        Node n1 = head.next;
        while(n1.next != null)
        {
            n = n.next;
            n1 = n1.next;
        }
        n.next = null;
    }
}
