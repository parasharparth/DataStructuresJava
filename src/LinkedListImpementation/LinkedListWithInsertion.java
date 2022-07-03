package LinkedListImpementation;

public class LinkedListWithInsertion {

    //The first step is to declare the Node class
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

    //The second step is to declare the head of the linked list
    Node head;

    public static void main(String[] args)
    {
        //The third step is to declare the linked list
        LinkedListWithInsertion list = new LinkedListWithInsertion();

        //The fifth step is to assign values to the Nodes
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;
        third.next = null;

        //The sixth step is to call the function to add a new node at the beginning
        list.addNodeInBeginning(4);

        //The seventh step is to add a new node in the end
        list.addNodeInTheEnd(5);

        //Print the linked list with the new Node
        list.traversal();
    }

    public void addNodeInBeginning(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void addNodeInTheEnd(int new_data)
    {
        Node new_node = new Node(new_data);

        if(head == null)
        {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;

        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    public void traversal() {
        Node n = head;
        while (n != null)
        {
            System.out.println("Data is: "+n.data);
            n = n.next;
        }
    }

}
