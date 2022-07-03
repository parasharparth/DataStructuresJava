package LinkedListImpementation;

public class LinkedListWithDeletion {

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
        LinkedListWithDeletion list = new LinkedListWithDeletion();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;
        third.next = null;
        list.addAtHead(0);
        list.addAtEnd(4);
        list.addNode(second,6);
        list.traversal();
    }

    public void addAtHead(int new_data)
    {
        System.out.println("Adding data: "+new_data+" at the beginning of the linked list");
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void addAtEnd(int new_data)
    {
        System.out.println("Adding data: "+new_data+" at the end of the linked list");
        if(head == null)
        {
            Node new_node = new Node(new_data);
            head = new_node;
            return;
        }
        Node new_node = new Node(new_data);
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = new_node;
        new_node.next = null;
        return;
    }

    public void addNode(Node prev_node, int new_data)
    {
        System.out.println("Adding data after: "+prev_node.data);
        if(prev_node == null)
        {
            System.err.println("The previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        return;
    }

    public void traversal()
    {
        System.out.println("The linked List after the operations is: ");
        Node n = head;
        while(n!=null)
        {
            System.out.println("Data is: "+n.data);
            n=n.next;
        }
    }
}
