package practice.CY2022.july11;

public class Stack {
    int capacity = 10;
    int top;
    int[] arr;

    Stack()
    {
        top = -1;
        arr = new int[capacity];
    }

    public boolean isEmpty()
    {
        if(top == -1)
        {
            System.out.println("The given stack is empty");
            return true;
        }
        //System.out.println("The given stack is not empty");
        return false;
    }

    public boolean isFull()
    {
        if(top == capacity)
        {
            System.out.println("The given stack is full");
            return true;
        }
        //System.out.println("The given stack is not full");
        return false;
    }

    public void traversal()
    {
        for(int i=0; i<=top;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public void peek()
    {
        if(isEmpty() == true)
        {
            return;
        }
        System.out.println("The element at the top is: "+arr[top]);
    }

    public void push(int element)
    {
        if(isFull() == true)
        {
            System.err.println("Cannot Push");
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element+ " added");
    }

    public void pop()
    {
        if(isEmpty() == true)
        {
            System.out.println("Cannot pop");
            return;
        }
        int element_removed = arr[top];
        top = top - 1;
        System.out.println("The element removed is: "+element_removed);
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.peek();
        stack.traversal();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();
        stack.traversal();
        stack.push(5);
        stack.peek();
        stack.traversal();
    }
}
