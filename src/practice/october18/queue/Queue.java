package practice.october18.queue;

public class Queue {

    int[] arr;
    int CAPACITY;
    int size;
    int front;
    int rear;

    Queue(int input_size)
    {
        CAPACITY = input_size;
        front = this.size = 0;
        rear = CAPACITY-1;
        arr = new int[CAPACITY];
    }

    boolean isFull(Queue queue)
    {
        if(queue.size == CAPACITY)
        {
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    boolean isEmpty(Queue queue)
    {
        if(queue.size == 0)
        {
            System.out.println("Queue is empty");
            return true;
        }
        return false;
    }

    void enqueue(int element)
    {
        if(isFull(this))
        {
            return;
        }
        this.rear = (this.rear+1)%this.CAPACITY;
        this.arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println(element+ " added");
    }

    void dequeue()
    {
        if(isEmpty(this))
        {
            return;
        }
        int to_be_removed = this.arr[this.front];
        this.front = (this.front+1)%CAPACITY;
        this.size = this.size - 1;
        System.out.println(to_be_removed +" removed");
    }

    void traversal()
    {
        if(isEmpty(this))
        {
            return;
        }
        for(int i=front; i<=rear; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void front()
    {
        if(isEmpty(this))
        {
            return;
        }
        System.out.println("front is: "+front);
    }

    void rear()
    {
        if(isFull(this))
        {
            return;
        }
        System.out.println("Rear is: "+rear);
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(3);
        queue.front();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.traversal();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.rear();
    }
}
