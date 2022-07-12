package practice.july12.stack;

public class Stack {

    int top;
    int capacity;
    int[] arr;

    Stack(int capacity)
    {
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    boolean isFull()
    {
        if(top == capacity)
        {
            System.out.println("The stack is full");
            return true;
        }
        return false;
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

    void peek()
    {
        if(isEmpty() == true)
        {
            return;
        }
        System.out.println("Peek: "+arr[top]);
    }

    void push(int element)
    {
        if(isFull() == true)
        {
            System.err.println("CANNOT ADD");
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element+ " added");
    }

    void pop()
    {
        if(isEmpty() == true)
        {
            System.err.println("CANNOT REMOVE");
            return;
        }
        int to_be_removed = arr[top];
        top = top - 1;
        System.out.println(to_be_removed+" removed");
    }

    void traversal()
    {
        if(isEmpty() == true)
        {
            return;
        }
        for(int i=0; i<=top;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.peek();
        stack.traversal();
        stack.pop();
        stack.pop();
        stack.peek();
        stack.traversal();
    }
}
