package practice.november08.stack;

public class Stack {

    int[] arr;
    int top;
    int capacity;

    Stack(int capacity)
    {
        this.capacity = capacity;
        arr =new int[capacity];
        top = -1;
    }

    boolean isEmpty()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    boolean isFull()
    {
        if(top == capacity-1)
        {
            return true;
        }
        return false;
    }

    void push(int element)
    {
        if(isFull())
        {
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element+ " added to the stack");
    }

    void pop()
    {
        if(isEmpty())
        {
            return;
        }
        int to_be_removed = arr[top];
        top = top - 1;
        System.out.println(to_be_removed+" removed from the stack");
    }
}
