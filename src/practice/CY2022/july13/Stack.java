package practice.CY2022.july13;

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
            System.out.println("Stack is full");
            return  true;
        }
        return false;
    }

    void peek()
    {
        if(isEmpty() == true)
        {
            return;
        }
        System.out.println("peek "+arr[top]);
    }

    void push(int element) {
        if (isFull() == true) {
            System.out.println("Cannot push");
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println(element+" added");
    }

    void pop()
    {
        if(isEmpty() == true)
        {
            System.out.println("Cannot pop");
            return;
        }
        int deleted = arr[top];
        top = top-1;
        System.out.println(deleted+ " deleted");
    }

    public void traversal()
    {
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
        stack.push(4);
        stack.push(5);
        stack.peek();
        stack.traversal();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.traversal();
    }
}
