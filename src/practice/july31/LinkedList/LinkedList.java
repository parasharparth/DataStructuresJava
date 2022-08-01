package practice.july31.LinkedList;

public class LinkedList {

    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public static void main(String[] args)
    {
        //noinspection DuplicatedCode
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;
        third.next = null;
        System.out.println("The initial list is: ");
        list.traversal();
        System.out.println("list after adding element to the head");
        list.addToHead(0);
        list.traversal();
        System.out.println("Adding an element to the tail");
        list.addToTail(4);
        list.traversal();
        System.out.println("Adding element to the middle");
        list.addToMiddle(10,second);
        list.traversal();
        System.out.println("removing an element from the head");
        list.removeFromHead();
        list.traversal();
        System.out.println("Deleting from tail");
        list.deleteFromTail();
        list.traversal();
        System.out.println("Deleting from middle");
        list.deleteFromMiddle(second);
        list.traversal();
    }

    public void deleteFromMiddle(Node to_be_deleted)
    {
        if(head == null)
        {
            System.err.println("List cannot be null");
            return;
        }
        Node prev_node = head;
        while(prev_node.next != to_be_deleted)
        {
            prev_node = prev_node.next;
        }
        prev_node.next = to_be_deleted.next;
    }

    public void deleteFromTail()
    {
        if(head == null)
        {
            System.err.println("The list cannot be null");
            return;
        }
        Node second_last = head;
        Node last = head.next;
        while(last.next != null)
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
            System.err.println("Cannot remove from an empty head");
            return;
        }
        head = head.next;
    }

    public void addToMiddle(int new_data, Node prev_node)
    {
        if(head == null || prev_node == null)
        {
            System.err.println("Head / prev node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
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
            new_node.next =null;
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
            System.out.print(n.data+"  ");
            n = n.next;
        }
        System.out.println();
    }
}
