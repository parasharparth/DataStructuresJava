package practice.december14.queue;

public class Queue {

    int[] arr;
    int size;
    int capacity = 10;
    int front;
    int rear;

    Queue()
    {
        arr = new int[capacity];
        front = this.size = 0;
        rear = capacity-1;
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

    boolean isFull(Queue queue)
    {
        if(queue.size == capacity)
        {
            System.out.println("The queue is full");
            return true;
        }
        return false;
    }

    boolean enqueue(int element)
    {
        if(isFull(this) == true)
        {
            return false;
        }
        this.rear = (this.rear + 1)%this.capacity;
        this.arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println("Element added "+ element);
        return true;
    }

    boolean dequeue()
    {
        if(isEmpty(this) == true)
        {
            return false;
        }
        int to_be_removed = this.arr[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        System.out.println(to_be_removed +" removed from the queue");
        return true;
    }

    void traversal()
    {
        for(int i=front; i<=rear; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.traversal();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.traversal();
    }
}
