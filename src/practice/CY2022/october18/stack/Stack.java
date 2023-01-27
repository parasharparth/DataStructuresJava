package practice.CY2022.october18.stack;

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
            System.out.println("Stack is empty");
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
    
    void push(int element)
    {
        if(isFull())
        {
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println("Element "+element+" added");
    }

    void pop()
    {
        if(isEmpty())
        {
            return;
        }
        System.out.println(arr[top]+ " is removed");
        top = top - 1;
    }

    void traversal()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.traversal();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
