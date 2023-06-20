package com.company;

public class QueueUsingLinkedList {
    Node front, rear;
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    QueueUsingLinkedList() {
        this.front = this.rear = null;
    }
    public void enQueue(int data) {
        Node newNode = new Node(data);
        // a.) If the Queue is empty -->
        if(front == null) {
            this.rear = this.front = newNode;
            System.out.println(data + " has been enQueued");
        } else {
            rear.next = newNode;
            rear = rear.next;
            System.out.println(data + " has been enQueued");
        }
    }
    public void deQueue() {
        if(front == null) {
            System.out.println("Queue is empty, call enQueue() to insert the data");
        } else if(front == rear) {
            front = rear = null;
        } else {
            System.out.println(front.data + " has been deQueued!");
            front = front.next;
        }
    }
    public int getFront() { return front.data; }
    public int getRear() { return rear.data; }
    public void display() {
        Node temp = front;
        while(temp != rear) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();            // front = null; rear = null;
        queue.enQueue(100);
        queue.enQueue(200);
        queue.enQueue(300);
        queue.display();                    // 100 200 300
        queue.deQueue();
        queue.deQueue();
        queue.display();                    // 300
        queue.deQueue();
        queue.deQueue();                    // Queue is empty.
    }
}
