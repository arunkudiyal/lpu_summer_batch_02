package com.company;
public class LinkedList {
    Node head;
    LinkedList() {
        this.head = null;
    }
    // a block which contains a data section & an address section
    static class Node {
        // data part
        int data;
        // address part
        Node next;
        // Constructor of the Node class
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Utility function to insert Node at the end of the LinkedList
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        // if the LL was not created.
        if(head == null) head = newNode;
        else {  // LL already exists
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // When the LL will be created for the first time, the head will not be pointing towards any node.
        LinkedList list = new LinkedList();                 // head = null
        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);
        list.insertAtEnd(400);
        list.insertAtEnd(500);
        list.display();                                     // 100 200 300 400 500
    }
}
