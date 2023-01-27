package practice.CY2022.october19.stack;

public class Stack {

    int[] arr;
    int CAPACITY;
    int top;

    Stack(int size)
    {
        CAPACITY = size;
        arr = new int[CAPACITY];
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
        if(top == CAPACITY-1)
        {
            System.out.println("Stack is Full");
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

    public static void main(String[] args)
    {
        Stack stack = new Stack(4);
        stack.pop();
        stack.push(1);
        stack.traversal();
        stack.push(2);
        stack.traversal();
        stack.push(3);
        stack.traversal();
        stack.push(4);
        stack.traversal();
        stack.push(5);
        stack.pop();
        stack.traversal();
        stack.pop();
        stack.traversal();
        stack.pop();
        stack.traversal();
        stack.pop();
        stack.traversal();
        stack.pop();

    }
}
