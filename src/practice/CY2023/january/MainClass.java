package practice.CY2023.january;

import practice.CY2023.january.jan15.Stack;

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
    }
}
