package practice.CY2022.december14.stack;

public class Stack {

    int[] arr;
    int capacity;
    int top;

    Stack(int capacity)
    {
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
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

    boolean push(int element)
    {
        if(isFull() == true)
        {
            return false;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element +" added to the stack");
        return true;
    }

    boolean pop()
    {
        if(isEmpty() == true)
        {
            return false;
        }
        int to_be_removed = arr[top];
        top = top -1;
        System.out.println(to_be_removed +" removed from the stack");
        return true;
    }

    void traversal()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(6);
        stack.push(0);
        stack.traversal();
        stack.push(1);
        stack.traversal();
        stack.push(2);
        stack.traversal();
        stack.push(3);
        stack.traversal();
        stack.push(4);
        stack.traversal();
        stack.pop();
        stack.traversal();
        stack.pop();
        stack.traversal();
        stack.pop();
        stack.traversal();
        stack.pop();
        stack.traversal();
        stack.pop();
        stack.traversal();
    }
}
