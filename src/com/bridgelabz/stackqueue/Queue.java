package com.bridgelabz.stackqueue;

public class Queue {
    Node front;
    Node rear;

    class Node {
        int data;
        Node next;

        Node() {
        }

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void add(int data) {
        Node newNode = new Node(data);  //enqueue
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    void remove(){
        front = front.next;             //Dequeue
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
