package practice.july31.Stack;

public class Stack {

    int CAPACITY=20;
    int top;
    int[] arr;

    Stack()
    {
        arr = new int[CAPACITY];
        top = -1;
    }

    boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        return false;
    }

    boolean isFull()
    {
        if(top == CAPACITY-1)
        {
            return true;
        }
        return false;
    }

    void peek()
    {
        if(isEmpty())
        {
            System.out.println("Cannot peek as stack is empty");
            return;
        }
        System.out.println(arr[top]);
    }

    void push(int element)
    {
        if(isFull() == true)
        {
            System.out.println("Th stack is full, cannot push");
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element+" added to position: "+top);
    }

    void pop()
    {
        if(isEmpty() == true)
        {
            System.out.println("The stack is empty, cannot pop");
            return;
        }
        int deleted = arr[top];
        top = top - 1;
        System.out.println(deleted+" deleted from stack");
    }

    void traversal()
    {
        for(int i=0; i<=top; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(1);
        stack.traversal();
        stack.push(2);
        stack.traversal();
        stack.push(3);
        stack.traversal();
        stack.push(4);
        stack.traversal();
        stack.peek();
        stack.pop();
        stack.traversal();
        stack.pop();
        stack.traversal();
        stack.pop();
        stack.traversal();
    }
}
