package practice.CY2022.october27.linkedlist;

public class LinkedList {

    Node head;

    void traversal()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n = n.next;
        }
    }

    void addToHead(int element)
    {
        if(head == null)
        {
            head = new Node(element);
            head.next = null;
            return;
        }
        Node n = new Node(element);
        n.next = head;
        head = n;
    }

    void addToPosition(int element, Node position)
    {
        if(head == null)
        {
            Node n = new Node(element);
            n.next = null;
        }

    }
}
