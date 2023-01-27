package practice.CY2022.july05;

public class LinkedList {

    //The first step is to define the node class
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

    //The second step is to define the head of the linked list
    Node head;

    public static void main(String[] args)
    {
        //The third step is to define the linked list
        LinkedList list = new LinkedList();

        //The fourth step is to define new nodes and assign data to those nodes.
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        //The fifth step is to define the connections between those nodes
        list.head.next = second;
        second.next = third;
        third.next = null;

        //Printing the linked list
        System.out.print("Initial List: ");
        list.traversal();

        //Adding Node to the head
        list.addToHead(4);

        //Printing the List
        System.out.print("List after adding an element to the head: ");
        list.traversal();

        //Adding node to any position
        list.addToPosition(second,5);

        //Printing the list
        System.out.print("list after adding the element to position: ");
        list.traversal();

        //Adding element to the tail
        list.addToTail(6);

        //Printing the list
        System.out.print("list after adding the element to the tail: ");
        list.traversal();
    }

    public void addToTail(int new_data)
    {
        if(head == null)
        {
            Node new_node = new Node(new_data);
            new_node = head;
            return;
        }

        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        Node new_node = new Node(new_data);
        last.next = new_node;
        new_node.next = null;

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

    public void addToHead(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void traversal()
    {
        Node n = head;
        while(n!= null)
        {
                System.out.print(n.data+"  ");
                n= n.next;
        }
        System.out.println();
    }
}
