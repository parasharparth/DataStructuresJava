package practice.july07;

public class LinkedList01 {

    //The first step is to define the Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            Node next = null;
        }
    }
        //Defining the head
        Node head;

        public static void main(String[] args)
        {
            LinkedList01 list1 = new LinkedList01();
            list1.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            list1.head.next = second;
            second.next = third;
            third.next = null;
            System.out.println("The initial list is: ");
            list1.traversal();
            list1.addToHead(0);
            System.out.println("list after adding a new element to head");
            list1.traversal();
            list1.addToPosition(second,4);
            System.out.println("List after adding at position: "+second.data);
            list1.traversal();
            list1.addToTail(5);
            System.out.println("List after adding a new element to tail :");
            list1.traversal();
            list1.deleteHead();
            System.out.println("List after deleting the head");
            list1.traversal();
            //list1.deleteFromPosition1(second,third);
            list1.deleteAfterNode(second);
            System.out.println("List after deleting element from a position");
            list1.traversal();
            list1.deleteUsingData(2);
            System.out.println("List after deleting using a Node's data: ");
            list1.traversal();
        }

        public void deleteUsingData(int data)
        {
            Node n = head;
            while(n!=null)
            {
                if(n.data == data)
                {
                    n.next = n.next.next;
                }
            }
        }
        public void deleteAfterNode(Node prev_node)
        {
            if(prev_node == null)
            {
                System.err.println("Previous node cannot be null");
                return;
            }
            Node temp = prev_node.next;
            prev_node.next = temp.next;
        }
//        public void deleteFromPosition1(Node prev_node, Node to_be_deleted)
//        {
//            if(prev_node==null || to_be_deleted==null)
//            {
//                System.out.println("Null Node found");
//                return;
//            }
//            //This is because we have to delete the third position but I am taking the Node named third.
//            //SO the answer will be wrong
//            //prev_node.next = to_be_deleted.next;
//            //to_be_deleted.next = null;
//        }
        public void deleteHead()
        {
            if(head == null)
            {
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
            Node last = head;
            while(last.next!= null)
            {
                last = last.next;
            }
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
            while(n!=null)
            {
                System.out.print(n.data+" ");
                n=n.next;
            }
            System.out.println();
        }
}
