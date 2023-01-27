package practice.CY2022.october20.stack;

public class Stack {

    int[] arr;
    int top;
    int capacity;

    Stack(int size)
    {
        capacity = size;
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
        if(top == capacity-1)
        {
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }

    void traversal()
    {
        if(isEmpty())
        {
            return;
        }
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i]);
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
        top = top - 1;
        System.out.println(to_be_removed+" removed");
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.traversal();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.traversal();
    }
}
