package practice.october22.queue;

public class Queue {

    int[] arr;
    int capacity;
    int size;
    int front;
    int rear;

    Queue(int num)
    {
        capacity = num;
        front = size = 0;
        rear = capacity - 1;
        arr = new int[capacity];
    }

    boolean isEmpty(Queue queue)
    {
        if(size == 0)
        {
            System.out.println("The queue is empty");
            return true;
        }
        return false;

    }

    boolean isFull(Queue queue)
    {
        if(size == capacity)
        {
           System.out.println("The queue is Full");
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
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
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
        System.out.println(element + "  added");
    }

    void dequeue()
    {
        if(isEmpty(this))
        {
            return;
        }
        int element = this.front;
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        System.out.println(element+ " index removed");
    }

    void front()
    {
        if(isFull(this))
        {
            return;
        }
        System.out.println("front "+ front);
    }

    void rear()
    {
        if(isFull(this))
        {
            return;
        }
        System.out.println("rear "+rear);
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(4);
        queue.front();
        queue.rear();
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
        queue.front();
        queue.rear();
    }
}
