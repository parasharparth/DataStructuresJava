package practice.CY2022.july11;

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
        System.out.println("The initial list is: ");
        list.traversal();
        list.addToHead(10);
        System.out.println("List after adding to head");
        list.traversal();
        list.addToPosition(second,11);
        System.out.println("List after adding element to a position: ");
        list.traversal();
        list.addToTail(12);
        System.out.println("List after adding element to the tail is: ");
        list.traversal();
        list.deleteFromHead();
        System.out.println("List after deleting element from the head is: ");
        list.traversal();
        list.deleteFromPosition(second);
        System.out.println("List after deleting element from position is: ");
        list.traversal();
        list.deleteFromTail();
        System.out.println("List after deleting from tail is: ");
        list.traversal();
    }

    public void deleteFromTail()
    {
        if(head == null)
        {
            System.err.println("List is empty");
            return;
        }
        Node prev_node = head;
        Node last = head.next;
        while(last.next!=null)
        {
            last = last.next;
            prev_node = prev_node.next;
        }
        prev_node.next = null;
    }

    public void deleteFromPosition(Node prev_node)
    {
        if(prev_node == null)
        {
            System.err.println("Previous node cannot be null");
            return;
        }
        if(head == null)
        {
            System.err.println("List is empty");
            return;
        }
        prev_node.next = prev_node.next.next;
    }

    public void deleteFromHead()
    {
        if(head == null)
        {
            System.err.println("The list is empty");
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
        Node n = head;
        while(n.next!= null)
        {
            n = n.next;
        }
        n.next = new_node;
        new_node.next = null;
    }

    public void addToPosition(Node prev_node,int new_data)
    {
        if(prev_node == null)
        {
            System.err.println("Previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
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
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }

}
