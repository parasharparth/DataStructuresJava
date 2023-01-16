package practice.CY2023.january.jan15;

public class Stack {

    int[] arr;
    int capacity = 5;
    int top;

    public Stack()
    {
        arr = new int[capacity];
        top = -1;
    }

    public boolean isEmpty()
    {
        if(top ==-1)
        {
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        if(top == capacity-1)
        {
            System.out.println("Stack is Full");
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
        top = top+1;
        arr[top] = element;
        System.out.println(element+" added");
    }

    public void pop()
    {
        if(isEmpty())
        {
            return;
        }
        int removed = arr[top];
        top = top -1;
        System.out.println(removed+" removed");
    }

    public void traversal()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
