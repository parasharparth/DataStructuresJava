package practice.CY2023.january.jan25;

public class Stack {

    int[] arr;
    int top;
    int capacity = 5;

    Stack()
    {
        arr = new int[capacity];
        top = -1;
    }

    boolean isEmpty()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }

    boolean isFull()
    {
        if(top == capacity - 1)
        {
            System.out.println("Stack is Full");
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
        System.out.println(element+" added");
    }

    void pop()
    {
        if(isEmpty())
        {
            return;
        }
        int removed = arr[top];
        top = top - 1;
        System.out.println(removed+" removed");
    }

    void traversal()
    {
        for(int i=top; i>=0 ; i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
