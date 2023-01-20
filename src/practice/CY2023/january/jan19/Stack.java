package practice.CY2023.january.jan19;

public class Stack {

    int[] arr;
    int top;
    int capacity = 5;

    Stack()
    {
        arr = new int[capacity];
        top = -1;
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
        if(top == capacity-1)
        {
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }

    public void push(int element)
    {
        if(isFull())
        {
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element +" added");
        return;
    }

    public void pop()
    {
        if(isEmpty())
        {
            return;
        }
        int removed = arr[top];
        top = top - 1;
        System.out.println(removed+" removed");
        return;
    }

    public void traversal()
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
