package practice.july09;

public class LinkedList01 {

    //The first step is to define the Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //The second step is to define the head
    Node head;

    //The third step is to write the driver code
    public static void main(String[] args) {
        LinkedList01 list = new LinkedList01();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;
        third.next = null;

        //Traversal
        System.out.println("the initial list is: ");
        list.traversal();

        //Adding to head
        list.addToHead(11);
        System.out.println("List after adding an element to the head: ");
        list.traversal();

        //Adding to tail
        list.addToTail(12);
        System.out.println("List after adding an element to the tail");
        list.traversal();

        //Adding to a new position
        list.addToPosition(second, 13);
        System.out.println("List after adding data to the desired position: ");
        list.traversal();

        //Deleting a node from the head
        list.deleteFromHead();
        System.out.println("List after removing element from head");
        list.traversal();

        //Deleting from tail
        list.deleteFromTail();
        System.out.println("List after deleting from tail");
        list.traversal();
    }

    public void deleteFromTail()
    {
        if(head == null)
        {
            System.out.println("Cannot delete from an empty list");
            return;
        }
        Node last = head.next;
        Node prev = head;
        while(last.next!= null)
        {
            last = last.next;
            prev = prev.next;
        }
        prev.next = null;
    }

    public void deleteFromHead()
    {
        if(head == null)
        {
            System.err.println("the head cannot be null");
            return;
        }
        head = head.next;
    }

    public void addToPosition(Node prev_node, int new_data)
    {
        if(prev_node == null)
        {
            System.err.println("The previous node cannot be null");
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
            System.out.print(n.data+"  ");
            n = n.next;
        }
        System.out.println();
    }
}
