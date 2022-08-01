package practice.july31.Queue;

public class Queue {

    int CAPACITY = 20;
    int size ;
    int[] arr;
    int front;
    int rear;

    Queue()
    {
        arr = new int[CAPACITY];
        front = size = 0;
        rear = CAPACITY-1;
    }

    boolean isEmpty(Queue queue)
    {
        if(queue.size == 0)
        {
            return true;
        }
        return false;
    }

    boolean isFull(Queue queue)
    {
        if(queue.size == CAPACITY)
        {
            return true;
        }
        return false;
    }

    boolean enqueue(int element)
    {
        if(isFull(this))
        {
            System.out.println("The Queue is full");
            return false;
        }
        this.rear = (this.rear + 1)%this.CAPACITY;
        this.arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println(element+ " added");
        return true;
    }

    boolean dequeue()
    {
        if(isEmpty(this))
        {
            System.out.println("The Queue is empty");
            return false;
        }
        int to_be_removed = this.front;
        this.front = (this.front + 1)%this.CAPACITY;
        this.size = this.size-1;
        System.out.println("removed element: "+to_be_removed);
        return true;
    }

    public void traversal()
    {
        System.out.println("Queue: ");
        for(int i=front; i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void front()
    {
        if(isEmpty(this) == true)
        {
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("Front is: "+front);
    }

    public void rear()
    {
        if(isEmpty(this) == true)
        {
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("Rear is: "+rear);
    }

    public static void main(String[] args)
    {
        Queue queue01 = new Queue();
        queue01.enqueue(1);
        queue01.enqueue(2);
        queue01.enqueue(3);
        System.out.println("The queue after adding elements");
        queue01.traversal();
        queue01.dequeue();
        System.out.println("Queue after removing the elements");
        queue01.traversal();

        queue01.front();
        queue01.rear();
    }
}
