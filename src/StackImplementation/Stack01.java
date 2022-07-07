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
    int CAPACITY = 10;
    int[] arr = new int[CAPACITY];
    int top;

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
        if(top == CAPACITY)
        {
            //Implies that the stack is full and no more elements can be added
            return true;
        }
        return false;
    }

    /**********************************************
     * Defining the Push operation for the stack
     **********************************************/

}
