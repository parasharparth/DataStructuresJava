package practice.october27.driver;

import practice.october27.queue.Queue;
import practice.october27.stack.Stack;

public class Driver {

    public static void main(String[] args)
    {
        System.out.println("-------------STACK OPERATIONS----------------");
        Stack stack = new Stack(4);
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.traversal();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.traversal();

        System.out.println("-----------------QUEUE OPERATIONS-----------------");
        Queue queue = new Queue(4);
        queue.dequeue();
        queue.front();
        queue.rear();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.traversal();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.traversal();
        queue.front();
        queue.rear();


    }
}
