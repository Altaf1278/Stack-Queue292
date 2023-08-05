package com.bridgelabz.stackqueue;

public class Stack {
    int[] stack = new int[3];
    int top = 0;

    public void push(int data) {
        if (top < stack.length) {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {
        if (top > 0) {
            top--;
           int data = stack[top];
            stack[top] = 0;
            return data;
        }
        return -1;
    }

    /*loop iterates over the elements in the stack array.
    loop starts from top - 1, which is the index of the top element in the stack,
    and goes down to 0*/
    public void display(){
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    public int peak(){
        int data;
        data = stack[top-1];
        return data;
    }

    public int getSize(){
        return top;
    }
}
