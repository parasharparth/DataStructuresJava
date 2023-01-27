package practice.CY2022.october19.queue;

public class Queue {

    int[] arr;
    int size;
    int CAPACITY;
    int front;
    int rear;

    Queue(int input_capacity)
    {
        CAPACITY = input_capacity;
        arr = new int[CAPACITY];
        front = size = 0;
        rear = CAPACITY-1;
    }

    boolean isEmpty(Queue queue)
    {
        if(size == 0)
        {
            System.out.println("The queue is Empty");
            return true;
        }
        return false;
    }

    boolean isFull(Queue queue)
    {
        if(size == CAPACITY)
        {
            System.out.println("The queue is Full");
            return true;
        }
        return false;
    }

    void enqueue(int element)
    {
        if(isFull(this))
        {
            System.out.println("Cannot Add");
            return;
        }
        this.rear = (this.rear+1)%this.CAPACITY;
        this.arr[this.rear] = element;
        this.size = this.size+1;
        System.out.println(element + " added");
    }

    void dequeue()
    {
        if(isEmpty(this))
        {
            System.out.println("Cannot dequeue");
            return;
        }
        int to_be_removed = this.arr[this.front];
        this.front = (this.front + 1)%this.CAPACITY;
        this.size = this.size - 1;
        System.out.println("element removed: "+to_be_removed);
    }

    void front()
    {
        if(isEmpty(this))
        {
            return;
        }
        System.out.println("Front: "+front);
    }

    void rear()
    {
        if(isFull(this))
        {
            return;
        }
        System.out.println("Read: "+ rear);
    }

    void traversal()
    {
        System.out.println("Traversal() ");
        if(isEmpty(this))
        {
            return;
        }
        for(int i=front; i<=rear; i++)
        {
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Queue queue = new Queue(4);
        queue.front();
        queue.rear();
        queue.enqueue(1);
        queue.traversal();
        queue.enqueue(2);
        queue.traversal();
        queue.enqueue(3);
        queue.traversal();
        queue.enqueue(4);
        queue.traversal();
        queue.front();
        queue.rear();
        queue.dequeue();
        queue.traversal();
        queue.dequeue();
        queue.traversal();
        queue.dequeue();
        queue.traversal();
        queue.dequeue();
        queue.traversal();
    }
}
