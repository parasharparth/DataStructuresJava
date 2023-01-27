package practice.CY2022.october11.queue;

public class Queue {

    //The first step is to define the variables
    int CAPACITY;  //For defining the capacity of the array
    int[] arr;  //Array which will work as the queue
    int size;   //Exact size of the queue at a particular point
    int front;  //
    int rear;   //

    Queue(int capacityNum)
    {
        CAPACITY = capacityNum;
        arr = new int[CAPACITY];
        front = this.size = 0;
        rear =  CAPACITY-1;
    }

    public boolean isEmpty(Queue queue)
    {
        if(queue.size == 0)
        {
            return true;
        }
        return false;
    }

    public boolean isFull(Queue queue)
    {
        if(queue.size == CAPACITY)
        {
            return true;
        }
        return false;
    }

    public void enqueue(int element)
    {
        if(isFull(this))
        {
            System.out.println("Queue is already full");
            return;
        }
        this.rear = (this.rear + 1)%this.CAPACITY;
        this.arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println("Element added to the queue is: "+element);
    }

    public void dequeue()
    {
        if(isEmpty(this))
        {
            System.out.println("The queue is already empty");
            return;
        }
        int removed = arr[this.front];
        this.front = (this.front + 1) % this.CAPACITY;
        this.size = this.size - 1;
        System.out.println("Element removed from the queue is: "+removed);
    }

    public void traversal()
    {
        System.out.println("Elements present in Queue are: - ");
        for(int i=front; i<=rear; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public void front()
    {
        if(isEmpty(this))
        {
            System.out.println("The Queue is empty");
            return;
        }
        System.out.println("Front: "+front);
    }

    public void rear()
    {
        if(isFull(this))
        {
            System.out.println("The Queue is full");
            return;
        }
        System.out.println("Rear: "+rear);
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.traversal();
        queue.enqueue(2);
        queue.traversal();
        queue.enqueue(3);
        queue.traversal();
        queue.enqueue(4);
        queue.traversal();
        System.out.println("The queue after adding elements");
        queue.traversal();
        queue.dequeue();
        queue.traversal();
        queue.dequeue();
        queue.traversal();
        queue.dequeue();
        queue.traversal();
        queue.dequeue();
        queue.traversal();
        System.out.println("Queue after removing the elements");
        queue.traversal();
        queue.front();
        queue.rear();
    }
}
