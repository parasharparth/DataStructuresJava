package LinkedListImpementation;

public class LinkedListWithTraversal {

    //The first step is to define the Node
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    //The second step is to define the head
    Node head;

    public static void main(String args[])
    {
        //The third step is to define the object of linkedList
        LinkedListWithTraversal list = new LinkedListWithTraversal();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;
        third.next = null;

        list.traversal();
    }

    public void traversal()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println("data is: "+n.data);
            n=n.next;
        }
    }
}
