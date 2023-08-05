package com.bridgelabz.stackqueue;

public class Stack {
    Node top;
    int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public boolean empty() {
        return (top == null);
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot perform pop operation.");
            return -1; // Return a default value indicating an empty stack
        } else {
            int poppedData = top.data;
            top = top.next;
            size--;
            return poppedData;
        }
    }

    public int size() {
        return size;
    }
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1; // Return a default value indicating an empty stack
        } else {
            return top.data;
        }
    }

}