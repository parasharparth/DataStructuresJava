package practice.CY2022.october26.queue;

public class Queue {

    int[] arr;
    int capacity;
    int size;
    int front;
    int rear;

    Queue(int input_size)
    {
        capacity = input_size;
        rear = capacity - 1;
        front = this.size = 0;
        arr = new int[capacity];
    }

    boolean isEmpty(Queue queue)
    {
        if(size == 0)
        {
            System.out.println("Queue is empty");
            return true;
        }
        return false;
    }

    boolean isFull(Queue queue)
    {
        if(size == capacity)
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
        if(isFull(this))
        {
            return;
        }
        this.rear = (this.rear+1)%this.capacity;
        this.arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println(element+" added to the queue");
    }

    void dequeue()
    {
        if(isEmpty(this))
        {
            return;
        }
        int to_be_removed = arr[front];
        this.front = this.front+1;
        this.size = this.size - 1;
        System.out.println(to_be_removed +" removed from the queue");
    }

    void front()
    {
        if(isEmpty(this))
        {
            return;
        }
        System.out.println("front: "+this.front);
    }

    void rear() {
        if(isFull(this))
        {
            return;
        }
        System.out.println("rear: "+this.rear);
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(4);
        queue.rear();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.traversal();
        queue.enqueue(5);
        queue.front();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.traversal();
    }
}
