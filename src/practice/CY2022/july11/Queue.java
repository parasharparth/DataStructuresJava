package practice.CY2022.july11;

public class Queue {

    int front;
    int rear;
    int size;
    int capacity = 10;
    int[] arr;

    Queue()
    {
        arr = new int[capacity];
        front = this.size = 0;
        rear = capacity-1;
    }

    public boolean isEmpty(Queue queue)
    {
        if(queue.size == 0)
        {
            System.out.println("The given queue is empty");
            return true;
        }
        return false;
    }

    public boolean isFull(Queue queue)
    {
        if(queue.size == capacity)
        {
            System.out.println("The given queue is full");
            return true;
        }
        return false;
    }

    public void traversal()
    {
        for(int i=front; i<=rear; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void enqueue(int element)
    {
        if(isFull(this) == true)
        {
            System.out.println("The given queue is full");
            return;
        }
        this.rear = (this.rear + 1)%this.capacity;
        this.arr[rear] = element;
        this.size = this.size + 1;
        System.out.println("Element added: "+element);
    }

    public void dequeue()
    {
        if(isEmpty(this) == true)
        {
            System.out.println("The given queue is empty");
            return;
        }
        int to_be_removed = this.front;
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        System.out.println("removed element: "+to_be_removed);
    }

    public void front()
    {
        if(isEmpty(this) == true)
        {
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("Front is: "+front);
    }

    public void rear()
    {
        if(isEmpty(this) == true)
        {
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("Rear is: "+rear);
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("The queue after adding elements");
        queue.traversal();
        queue.dequeue();
        System.out.println("Queue after removing the elements");
        queue.traversal();
        queue.front();
        queue.rear();
    }

}
