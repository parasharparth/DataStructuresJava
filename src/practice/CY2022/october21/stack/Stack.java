package practice.CY2022.october21.stack;

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
                System.out.println("The stack is empty");
                return true;
            }
            return false;
        }

        boolean isFull()
        {
            if(top == capacity - 1)
            {
                System.out.println("The stack is full");
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
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        void push(int element)
        {
            if(isFull())
            {
                return;
            }
            top = top + 1;
            arr[top] = element;
            System.out.println(element+" added to the stack");
        }

        void pop()
        {
            if(isEmpty())
            {
                return;
            }
            int to_be_removed = arr[top];
            top = top - 1;
            System.out.println(to_be_removed+" removed from the stack");
        }

        void peek()
        {
            if(isEmpty())
            {
                return;
            }
            System.out.println("top element is: "+arr[top]);
        }

        public static void main(String[] args)
        {
            Stack stack = new Stack(4);
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
            stack.traversal();
        }
}
