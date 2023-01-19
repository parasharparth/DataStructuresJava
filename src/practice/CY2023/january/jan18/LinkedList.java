package practice.CY2023.january.jan18;

public class LinkedList {

    public static class Node
    {
        public int data;
        public Node next;
        public Node(int data)
        {
            this.data = data;
            next = null;
        }

        public Node head;

        public void traversal()
        {
            Node n = head;
            if(head == null)
            {
                System.out.println("Linked List is Empty");
                return;
            }

            while(n!=null)
            {
                System.out.print(n.data+" ");
                n=n.next;
            }
            System.out.println();
        }

        public void addToHead(int element)
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

        public void addToPosition(Node prev_Node, int element)
        {
            if(prev_Node == null)
            {
                System.out.println("!!Previous Node cannot be null... Exiting");
                return;
            }
            Node n = new Node(element);
            n.next = prev_Node.next;
            prev_Node.next = n;
        }

        public void addToTail(int element)
        {
            Node n1 = new Node(element);
            if(head == null)
            {
                head= new Node(element);
                head.next = null;
                return;
            }
            n1.next = null;
            Node last = head;
            while(last.next!= null)
            {
                last = last.next;
            }
            last.next = n1;
            return;
        }

        public void deleteFromHead()
        {
            if(head == null)
            {
                System.out.println("Linked list is already empty");
                return;
            }
            if(head.next == null)
            {
                head = null;
                return;
            }
            head = head.next;
        }

        public void deleteFromTail()
        {
            if(head == null)
            {
                System.out.println("Head is already empty");
                return;
            }
        }
    }
}
