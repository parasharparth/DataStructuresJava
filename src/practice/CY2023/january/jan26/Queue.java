package practice.CY2023.january.jan26;

public class Queue {

    int[] arr;
    int front;
    int rear;
    int capacity = 5;
    int size;

    Queue()
    {
        arr = new int[capacity];
        rear = capacity-1;
        front = size = 0;
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

    void enqueue(int element)
    {
        if(isFull(this))
        {
            return;
        }
        this.rear = (this.rear + 1)%this.capacity;
        this.arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println(element+" added");
    }

    void dequeue()
    {
        if(isEmpty(this))
        {
            return;
        }
        int removed = this.arr[this.front];
        this.front = (this.front + 1)% this.capacity;
        this.size = this.size - 1;
        System.out.println(removed + " removed");
    }

    void traversal()
    {
        for(int i=front; i<=rear; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
