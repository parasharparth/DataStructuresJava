package practice.CY2023.january.jan04;

public class Queue {

    int[] arr;
    int front;
    int rear;
    int capacity = 5;
    int size;

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
            return true;
        }
        return false;
    }
}
