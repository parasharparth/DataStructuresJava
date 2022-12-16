package practice.december15;

public class Stack {

    int[] arr;
    int top;
    int capacity;

    Stack(int size)
    {
        capacity = size;
        top = -1;
        arr = new int[capacity];
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

    boolean push(int element)
    {
        if(isFull())
        {
            return false;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element + " added");
        return true;
    }

    boolean pop()
    {
        if(isEmpty())
        {
            return false;
        }
        int to_be_removed = arr[top];
        top = top - 1;
        System.out.println(to_be_removed +" removed");
        return true;
    }

    void traversal()
    {
        if(isEmpty())
        {
            return;
        }
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.traversal();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.traversal();
    }
}
