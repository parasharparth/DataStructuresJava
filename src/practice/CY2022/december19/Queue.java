package practice.CY2022.december19;

public class Queue {

    int[] arr;
    int rear;
    int front;
    int size;
    int capacity = 5;

    Queue()
    {
        arr = new int[capacity];
        front = size = 0;
        rear = capacity-1;
    }

    boolean isEmpty(Queue queue)
    {
        if(queue.size == 0)
        {
            System.out.println("Queue is Empty");
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

    boolean enqueue(int element)
    {
        if(isFull(this))
        {
            return false;
        }
        this.rear = (this.rear + 1)%this.capacity;
        this.arr[this.rear] = element;
        this.size = this.size + 1;
        System.out.println(element+" added");
        return true;
    }

    boolean dequeue()
    {
        if(isEmpty(this))
        {
            return false;
        }
        int to_be_removed = this.arr[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size-1;
        System.out.println(to_be_removed +" removed");
        return true;
    }

    void traversal()
    {
        System.out.print("Queue: ");
        for(int i=this.front; i<=this.rear; i++)
        {
            System.out.print(this.arr[i] +" ");
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
