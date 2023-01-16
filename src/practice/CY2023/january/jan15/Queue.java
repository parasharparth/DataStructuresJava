package practice.CY2023.january.jan15;

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
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    public void enqueue(int element)
    {

    }

}
