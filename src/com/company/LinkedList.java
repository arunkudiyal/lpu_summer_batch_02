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
    // Utility function which inserts the node at the start of the LL
    public void insertAtBeg(int data) {
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }
    // Utility function which inserts data1 after data2
    public void insertAfter(int data1, int data2) {
        Node temp = head;
        // a.) check if d2 exists in the LL or not
        while(temp.data != data2) {
            temp = temp.next;
            if(temp == null) {
                System.out.println(data2 + " is not available in the LL, use insertEnd() to insert the data!");
                break;
            }
        }
        // b.) d2 exists in the LL (temp.data == data)
        if(temp != null) {
            Node newNode = new Node(data1);
            Node temp2 = temp.next;
            temp.next = newNode;
            newNode.next = temp2;
        }
    }
    // Utility function to remove the last element of the LinkedList
    public void deleteFromEnd() {
        Node temp = head;
        while(temp.next.next != null) temp = temp.next;
        temp.next = null;
    }
    // Utility function to remove the first element from the LinkedList
    public void deleteFromStart() {
        head = head.next;
    }
    // Utility function to print the values of the LL in the forward direction
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Utility function to print the values of the LL in reverse order
    public void printReverse(Node head) {
        if(head == null) return;
        printReverse(head.next);
        System.out.print(head.data + " ");
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
        list.insertAtBeg(10);
        list.display();                                     // 10 100 200 300 400 500
        list.insertAfter(50, 300);
        list.display();                                     // 10 100 200 300 50 400 500
        list.deleteFromEnd();
        list.display();                                     // 10 100 200 300 50 400
        list.deleteFromStart();
        list.display();                                     // 100 200 300 50 400
        list.printReverse(list.head);                       // 400 50 300 200 100
    }
}
