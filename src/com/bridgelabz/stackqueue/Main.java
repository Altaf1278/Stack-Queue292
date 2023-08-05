package com.bridgelabz.stackqueue;
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();

        //Peek Method:
        System.out.println("Peek Element is: "+stack.peek());

        //Pop Method:
        System.out.println("Pop Element is: "+stack.pop());
        stack.display();

        System.out.println("Pop Element is: "+stack.pop());
        stack.display();

        System.out.println("Pop Element is: "+stack.pop());
        stack.display();

    }
}