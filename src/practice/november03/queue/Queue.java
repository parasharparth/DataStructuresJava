package practice.november03.queue;

public class Queue {

    int[] arr;
    int capacity;
    int rear;
    int front;
    int size;

    Queue(int capacity)
    {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity-1;
        arr = new int[capacity];
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

    boolean isFull(Queue queue)
    {
        if(queue.size == capacity)
        {
            System.out.println("Queue is full");
            return true;
        }
        return false;
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

    void enqueue(int element)
    {

    }

}
