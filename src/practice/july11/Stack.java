package practice.july11;

public class Stack {
    int capacity = 10;
    int top;
    int[] arr;

    Stack()
    {
        top = -1;
        arr = new int[capacity];
    }

    public void isEmpty()
    {
        if(top == -1)
        {
            System.out.println("The given stack is empty");
            return;
        }
        System.out.println("The given stack is not empty");
    }

    public void isFull()
    {
        if(top == capacity-1)
        {
            System.out.println("The given stack is full");
            return;
        }
        System.out.println("The given stack is not full");
    }

    public void traversal()
    {

    }
}
