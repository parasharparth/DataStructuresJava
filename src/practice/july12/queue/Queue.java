package practice.july12.queue;

import java.awt.desktop.SystemEventListener;

public class Queue {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    Queue(int capacity)
    {
        this.capacity = capacity;
        arr=new int[capacity];
        front = this.size = 0;
        rear = capacity-1;
    }

    boolean isFull(Queue queue)
    {
        if(queue.size == capacity)
        {
            System.out.println("The queue is full");
            return true;
        }
        return false;
    }

    boolean isEmpty(Queue queue)
    {
        if(queue.size == 0)
        {
            System.out.println("The queue is empty");
            return true;
        }
        return false;
    }

    void enqueue(int element)
    {
        if(isFull(this) == true)
        {
            System.out.println("CANNOT ENQUEUE");
            return;
        }
        this.rear = (this.rear+1)%this.capacity;
        arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println(element+" added");
    }

    void dequeue()
    {
        if(isEmpty(this) == true)
        {
            System.out.println("CANNOT DEQUEUE");
            return;
        }
        int element = arr[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        System.out.println(element+" removed");
    }

    void front()
    {
        System.out.println("front: "+this.front);
    }

    void rear()
    {
        System.out.println("Rear: "+this.rear);
    }

    void traversal()
    {
        for(int i=front; i<=rear; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(10);
        queue.front();
        queue.rear();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.traversal();
        queue.front();
        queue.rear();
        queue.dequeue();
        queue.dequeue();
        queue.traversal();
        queue.front();
        queue.rear();
    }
}
