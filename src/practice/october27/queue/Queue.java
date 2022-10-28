package practice.october27.queue;

public class Queue {

    int[] arr;
    int capacity;
    int size;
    int front;
    int rear;

    public Queue(int input_size)
    {
        capacity = input_size;
        front = this.size = 0;
        rear = capacity-1;
        arr = new int[capacity];
    }

    public boolean isEmpty(Queue queue)
    {
        if(queue.size == 0)
        {
            System.out.println("The queue is empty");
            return true;
        }
        return false;
    }

    public boolean isFull(Queue queue)
    {
        if(queue.size == capacity)
        {
            System.out.println("The queue is full");
            return true;
        }
        return false;
    }

    public void enqueue(int element)
    {
        if(isFull(this))
        {
            return;
        }
        this.rear = (this.rear + 1)%this.capacity;
        this.arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println(element+" added to the queue");
    }

    public void dequeue()
    {
        if(isEmpty(this))
        {
            return;
        }
        int to_be_removed = this.arr[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        System.out.println(to_be_removed +" removed from the queue");
    }

    public void traversal()
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

    public void front()
    {
        if(isEmpty(this))
        {
            return;
        }
        System.out.println("front is: "+this.front);
    }

    public void rear()
    {
        if(isFull(this))
        {
            return;
        }
        System.out.println("rear is: "+this.rear);
    }
}
