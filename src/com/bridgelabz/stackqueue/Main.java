package com.bridgelabz.stackqueue;
public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        //Enqueue Method:
        queue.add(56);
        queue.add(30);
        queue.add(70);
        queue.display();

        //Dequeue method:
        System.out.println("Dequeue elements:" );
        queue.remove();
        queue.display();
    }

}