package practice.CY2022.july19;

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

        System.out.println("The initial list is: -");
        list.traversal();
        System.out.println("Adding a new element to the head");
        list.addToHead(0);
    }

    public void addToHead(int new_data)
    {
        Node new_node = new Node(new_data);
        
    }
    public void traversal()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data +"  ");
            n = n.next;
        }
    }
}
