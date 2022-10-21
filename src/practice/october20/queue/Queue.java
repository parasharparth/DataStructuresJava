package practice.october20.queue;

public class Queue {

    int[] arr;
    int capacity;
    int size;
    int front;
    int rear;

    Queue(int size1)
    {
        capacity = size1;
        rear = size = 0;
        front = capacity-1;
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
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    void traversal()
    {
        for(int i=front; i<rear; i++)
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
        System.out.println(element + " added to the queue");
    }

    void dequeue()
    {
        if(isEmpty(this))
        {
            return;
        }
        int to_be_removed = this.arr[this.front];
        this.front = (this.front+1)%this.capacity;
        this.size = this.size - 1;
        System.out.println(to_be_removed +" removed from the queue");
    }

    void front()
    {
        if(isEmpty(this))
        {
            return;
        }
        System.out.println("front: "+front);
    }

    void rear()
    {
        if(isFull(this))
        {
            return;
        }
        System.out.println("Rear: "+rear);
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.traversal();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.traversal();
    }
}
