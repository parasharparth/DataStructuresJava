package StackImplementation;

/****************************************************************************************************************
 * There are two ways to implement a Stack using java - Arrays and LinkedList
 * In this class, we are going to be using Arrays for implementation of stack
 * There are 4 functions which will be used
 * PUSH
 * POP
 * IS FULL
 * IS EMPTY
 * Since stack is a LIFO structure, the most common application internally in java is in the String class
 * where the String class internally uses a stack to reverse a string as LIFO easily enables that
 *****************************************************************************************************************/
public class Stack01 {

    /*****************************************************************************************************
     * Defining the Array which will act as a stack and the variable which will point to the top element
     *****************************************************************************************************/
    int CAPACITY = 5;
    int[] arr;
    int top;

    Stack01()
    {
        arr = new int[CAPACITY];
        top = -1;
    }

    /*************************************************
     * Defining the isEmpty() function
     * if top==-1, then empty
     **************************************************/
    public boolean isEmpty()
    {
        if(top == -1)
        {
            //implies that the stack is empty
            return true;
        }
        return false;
    }

    /**************************************************
     * Defining the isFull function
     * if top == capacity, then full
     **************************************************/
    public boolean isFull()
    {
        if(top == CAPACITY-1)
        {
            //Implies that the stack is full and no more elements can be added
            return true;
        }
        return false;
    }

    /**********************************************
     * Defining the Push operation for the stack
     **********************************************/
    public boolean push(int element)
    {
        System.out.println("Adding element: "+element+" to the stack");
        if(isFull() == true)
        {
            System.out.println("The given stack is already full, Cannot add more elements");
            return false;
        }
        top = top +1;
        arr[top] = element;
        return true;
    }

    /************************************************************************
     * Defining the Pop operation for the stack
     * Remember that pop always refers to removing element from the top
     ************************************************************************/
    public boolean pop()
    {
        System.out.println("Calling the pop function for removing the top element");
        if(isEmpty() == true)
        {
            System.out.println("The stack is empty, cannot remove elements");
            return false;
        }
        top = top-1;
        return true;
    }

    /******************************************************
     * Stack Traversal from top to bottom (in LIFO form)
     ******************************************************/
    public void traversal()
    {
        System.out.println("STACK IN LIFO FORM is: ");
        for(int i=top;i>=0; i--)
        {
            System.out.println(arr[i]+"  ");
        }
    }

    /***********************************************************************
     * Peek function to check the element present at the top of the stack
     ***********************************************************************/
    public void peek()
    {
        System.out.println("Calling the peek function");
        if(isEmpty() == true)
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(arr[top]);
    }

    /*****************************************************
     * Driver function--> main function
     ******************************************************/
    public static void main(String[] args)
    {
        Stack01 stack01 = new Stack01();
        stack01.push(1);
        stack01.push(2);
        stack01.push(3);
        stack01.push(4);
        stack01.push(5);
        System.out.println("Stack after push operations");
        stack01.traversal();
        stack01.pop();
        stack01.pop();
        stack01.pop();
        System.out.println("Stack after popping some elements");
        stack01.traversal();
        stack01.peek();
    }
}
