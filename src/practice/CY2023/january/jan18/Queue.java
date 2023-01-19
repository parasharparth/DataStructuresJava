package practice.CY2023.january.jan18;

public class Queue {

    int[] arr;
    int rear;
    int front;
    int capacity = 5;
    int size;

    public Queue()
    {
        arr = new int[capacity];
        front = this.size = 0;
        rear = capacity-1;
    }

    public boolean isEmpty(Queue queue)
    {
        if(queue.size == 0)
        {
            System.out.println("Queue is empty");
            return true;
        }
        return false;
    }

    public boolean isFull(Queue queue)
    {
        if(queue.size == capacity)
        {
            System.out.println("Queue is full");
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
        this.rear = (this.rear+1)%this.capacity;
        this.arr[this.rear] = element;
        this.size = this.size+1;
        System.out.println(element+" added");
    }

    public void dequeue()
    {
        if(isFull(this))
        {
            return;
        }
        int removed = this.arr[this.front];
        this.front = (this.front+1)%this.capacity;
        this.size = this.size-1;
        System.out.println(removed+" removed");
    }

    public void traversal()
    {
        for(int i=front; i<=rear; i++)
        {
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }
}
