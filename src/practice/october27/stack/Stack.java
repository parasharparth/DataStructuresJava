package practice.october27.stack;

public class Stack {

    int[] arr;
    int top;
    int capacity;

    public Stack(int size)
    {
        capacity = size;
        top = -1;
        arr = new int[capacity];
    }

    public boolean isEmpty()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        if(top == capacity -1)
        {
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }

    public void traversal()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public void push(int element)
    {
        if(isFull())
        {
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element+ " added to the stack");
    }

    public void pop()
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
