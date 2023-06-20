package com.company;

public class BinaryTree {
    // root -> Start of the Binary Tree, and the branches will be created from the root.
    Node root;
    BinaryTree() {
        this.root = null;
    }
    // Any tree which contains the address for the left subtree (left), and right subtree (right)
    public static class Node {
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();                // root = null;
        // insert a value to the root
        if(bTree.root == null) {
            Node newNode = new Node(100);
            bTree.root = newNode;
        } else {
            bTree.root.left = new Node(200);
            bTree.root.right = new Node(300);
            bTree.root.left.left = new Node(400);
            bTree.root.left.right = new Node(500);
        }
    }
}
