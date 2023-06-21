package com.company;

public class BinarySearchTree {
    Node root;
    BinarySearchTree() {
        this.root = null;
    }
    private static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    // Encapsulated code
    public void insert(int data) {
        root = insertData(root, data);
    }
    public void inOrder() {
        inOrderTraversal(root);
        System.out.println();
    }
    private Node insertData(Node root, int data) {
        if(root == null) root = new Node(data);
        else if(root.data > data) root.left = insertData(root.left, data);
        else if(root.data < data) root.right = insertData(root.right, data);
        return root;
    }
    private void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);        // L
            System.out.print(root.data + " ");  // D
            inOrderTraversal(root.right);       // R
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();          // root = null;
        bst.insert(45);
        bst.insert(6);
        bst.insert(78);
        bst.insert(90);
        bst.insert(12);
        bst.insert(23);
        bst.insert(21);
        bst.insert(43);
        // NOTE :- The inOrder of any BSt will always be in ascending order!
        bst.inOrder();
    }
}
