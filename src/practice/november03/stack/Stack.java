package practice.november03.stack;

public class Stack {

    int[] arr;
    int top;
    int capacity;

    Stack(int size)
    {
        this.capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    boolean isEmpty()
    {
        if(top == -1)
        {
            System.out.println("The stack is empty");
            return true;
        }
        return false;
    }

    boolean isFull()
    {
        if(top == capacity-1)
        {
            System.out.println("The stack is full");
            return true;
        }
        return false;
    }

    void traversal()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void push(int element)
    {
        if(isFull())
        {
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element+" added");
    }

    void pop()
    {
        if(isEmpty())
        {
            return;
        }
        int to_be_removed = arr[top];
        top = top -1;
        System.out.println(to_be_removed+" removed");
    }
}
