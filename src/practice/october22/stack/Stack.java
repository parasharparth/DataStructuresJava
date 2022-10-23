package practice.october22.stack;

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
            System.out.println("Stack is empty");
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
            System.out.print(arr[i] +"  ");
        }
        System.out.println();
    }

    void peek()
    {
        if(isEmpty())
        {
            return;
        }
        System.out.println("The top element is: "+arr[top]);
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
        System.out.println(removed+ " removed");
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.traversal();
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.traversal();
        stack.peek();
    }
}
