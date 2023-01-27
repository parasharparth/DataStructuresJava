package practice.CY2022.october11.stack;

public class Stack {

    int CAPACITY = 10;
    int[] arr;
    int top;

    Stack()
    {
        arr = new int[CAPACITY];
        top = -1;
    }

    Stack(int num)
    {
        CAPACITY = num;
        arr = new int[CAPACITY];
        top = -1;
    }

    public boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        if(top == CAPACITY-1)
        {
            return true;
        }
        return false;
    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Peek - stack is empty");
            return;
        }
        System.out.println("Peek - top element is: "+arr[top]);
    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty--> Cannot pop ");
            return;
        }
        System.out.println("Element Removed is: "+arr[top]);
        top = top - 1;
    }

    public void push(int element)
    {
        if(isFull())
        {
            System.out.println("Stack is Full --> Cannot push "+ element);
            return;
        }
        System.out.println("Element added is: "+element);
        top = top + 1;
        arr[top] = element;
    }

    public void traversal()
    {
        if(isEmpty())
        {
            System.out.println("Cannot Traverse as Stack is empty");
            return;
        }

        System.out.println("Elements of Stack are: ");
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(5);
        stack.peek();
        stack.push(1);
        stack.traversal();
        stack.push(2);
        stack.traversal();
        stack.push(3);
        stack.traversal();
        stack.push(4);
        stack.traversal();
        stack.push(5);
        stack.traversal();
        stack.push(6);
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
        stack.pop();
        stack.traversal();
    }
}
