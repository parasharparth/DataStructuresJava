package practice.CY2023.january.jan24;

public class Queue {

    int[] arr;
    int size;
    int capacity = 5;
    int front;
    int rear;

    public Queue()
    {
        arr = new int[capacity];
        front = size = 0;
        rear = capacity-1;
    }

    public boolean isEmpty(Queue queue)
    {
        if(size == 0)
        {
            System.out.println("Queue is Empty");
            return true;
        }
        return false;
    }

    public boolean isFull(Queue queue)
    {
        if(size == capacity)
        {
            System.out.println("Queue is Full");
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
        this.size = this.size + 1;
        System.out.println(element+" added");
    }

    public void dequeue()
    {
        if(isEmpty(this))
        {
            return;
        }
        int removed = this.arr[this.front];
        this.front = (this.front+1)%this.capacity;
        this.size = this.size - 1;
        System.out.println(removed+" removed");
    }

    public void traversal()
    {
        for(int i=front; i<=rear; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
