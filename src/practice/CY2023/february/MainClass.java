package practice.CY2023.february;

import practice.CY2023.february.feb03.Stack;
import practice.CY2023.february.feb03.Queue;

public class MainClass {

    public static void main(String[] args)
    {
        System.out.println("-------------STACK OPERATIONS--------------");
        Stack stack = new Stack();
        System.out.println("-----------PUSH OPERATION---------------");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("--------------STACK AFTER PUSH OPERATION-------------");
        stack.traversal();
        System.out.println("-----------POP OPERATION------------");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("--------------STACK AFTER POP OPERATION-------------");
        stack.traversal();

        System.out.println("----------------QUEUE OPERATIONS------------------");
        Queue queue = new Queue();
        System.out.println("----------------ENQUEUE OPERATION------------------");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("-------------------QUEUE AFTER ENQUEUE OPERATION---------------");
        queue.traversal();
        System.out.println("-------------------DEQUEUE OPERATION--------------------");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("-------------------------QUEUE AFTER DEQUEUE OPERATION------------------------");
        queue.traversal();
    }
}
