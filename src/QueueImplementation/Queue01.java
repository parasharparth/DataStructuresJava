package QueueImplementation;

/*********************************************************************************************
 * This is the basic implementation of a linear queue using arrays
 * It has two ends with two integers pointing to the two ends namely
 * rear and front
 * The enqueue operation which is adding a new element to the queue is done from the rear
 * The dequeue operation which is removing element from the queue is done from the front.
 *********************************************************************************************/
public class Queue01 {

    /***********************************************
     * Defining the global variables
     * size
     * capacity
     * array
     * front
     * rear
     **********************************************/
    int[] arr;
    int size;
    int CAPACITY = 10;
    int front;
    int rear;

    /***************************************************************************
     * Queue Constructor for initializing the array and other global variable
     ***************************************************************************/
    Queue01()
    {
        arr = new int[CAPACITY];
        front = this.size = 0;
        rear = CAPACITY-1;
    }

    /****************************************************************************
     * isEmpty() function used to check whether the given queue is empty or not
     ****************************************************************************/
    boolean isEmpty(Queue01 queue01)
    {
        if(queue01.size == 0)
        {
            return true;
        }
        return false;
    }

    /********************************************************************************
     * isFull() function used to check whether the given queue is full or not
     ********************************************************************************/
    boolean isFull(Queue01 queue01)
    {
        if(queue01.size == CAPACITY)
        {
            return true;
        }
        return false;
    }

    /*****************************************************************************
     * enqueue() function is used to add an element to the rear of the queue
     ****************************************************************************/
     public boolean enqueue(int element)
     {
         if(isFull(this) == true)
         {
             System.out.println("The given queue is already full");
             return false;
         }
         this.rear = (this.rear+1)%this.CAPACITY;
         this.arr[this.rear] = element;
         this.size = this.size+1;
         System.out.println("Element added: "+element);
         return true;
     }

    /**************************************************************************************
     * Dequeue function to remove an element from the front of the queue
     * Element removed from the front and does not require any element to be specified
     **************************************************************************************/
    public boolean dequeue()
    {
        if(isEmpty(this) == true)
        {
            System.out.println("The given queue is empty");
            return false;
        }
        int to_be_removed = this.front;
        this.front = (this.front + 1)%this.CAPACITY;
        this.size = this.size-1;
        System.out.println("removed element: "+to_be_removed);
        return true;
    }

    /********************************************************************************
     * Traversal function to print the elements of the queue in the insertion order
     *******************************************************************************/
    public void traversal()
    {
        System.out.println("Queue: ");
        for(int i=front; i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }

    /***********************************************************************
     * front() function to view the element present at the front position
     ***********************************************************************/
    public void front()
    {
        if(isEmpty(this) == true)
        {
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("Front is: "+front);
    }

    /********************************************************************
     * rear() function to view the element present at the rear position
     ********************************************************************/
    public void rear()
    {
        if(isEmpty(this) == true)
        {
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("Rear is: "+rear);
    }

    /***********************************************************************************
     * Driver Function --> MAIN FUNCTION from where the program will start executing
     ***********************************************************************************/
    public static void main(String[] args)
    {
        Queue01 queue01 = new Queue01();
        queue01.enqueue(1);
        queue01.traversal();
        queue01.enqueue(2);
        queue01.traversal();
        queue01.enqueue(3);
        System.out.println("The queue after adding elements");
        queue01.traversal();
        queue01.dequeue();
        System.out.println("Queue after removing the elements");
        queue01.traversal();

        queue01.front();
        queue01.rear();
    }
}

