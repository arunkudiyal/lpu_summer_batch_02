package com.company;
public class StackUsingLinkedList {
    Node top;
    private static class Node {
        int data;
        Node next;
    }
    StackUsingLinkedList() {
        this.top = null;
    }
    public void push(int data) {
        Node newNode = new Node();
        // Q1:- How would you define stack overflow here?
        // Stack Overflow -> The point where no more push() operations can be performed because of lack of memory.
        if(newNode == null) {
            System.out.println("Stack Overflow!");
            return;
        }
        newNode.data = data;
        newNode.next = top;
        top = newNode;
        System.out.println(data + " has been pushed!");
    }
    public void pop() {
        if(top == null) {
            System.out.println("Stack Underflow!");
            return;
        } else {
            System.out.println(top.data + " has been popped!");
            top = top.next;
        }
    }
    public void display()  {
        if(top == null) {
            System.out.println("Stack Underflow!");
            return;
        } else {
            Node temp = top;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    public int peek() {
        return top.data;
    }
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.display();                            // 400 300 200 100
        stack.pop();
        stack.display();                            // 300 200 100
        System.out.println(stack.peek());           // 300
    }
}
