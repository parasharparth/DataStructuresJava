package practice.CY2022.november08.queue;

public class Queue {

    int[] arr;
    int size;
    int capacity;
    int front;
    int rear;

    Queue(int size1)
    {
        this.capacity = size1;
        this.front = this.size = 0;
        this.rear = this.capacity-1;
        this.arr = new int[this.capacity];
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

    void enqueue(int element)
    {
        if(isFull(this))
        {
            return;
        }
        this.rear = (this.rear + 1)%this.capacity;
        this.arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println(element+"  added to the queue");
    }

    void dequeue()
    {
        if(isEmpty(this))
        {
            return;
        }
    }
}
