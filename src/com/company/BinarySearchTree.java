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
    public void delete(int key) {
        root = deleteKey(root, key);
    }
    public boolean search(int key) {
        Node address = searchKey(root, key);        // address -> # | null
        if(address == null) return false;
        else return true;
    }
    public void inOrder() {
        inOrderTraversal(root);
        System.out.println();
    }
    public void preOrder() {
        preOrderTraversal(root);
        System.out.println();
    }
    public void postOrder() {
        postOrderTraversal(root);
        System.out.println();
    }
    public void reverseOrder() {
        reverseOrderTraversal(root);
        System.out.println();
    }
    private Node insertData(Node root, int data) {
        if(root == null) root = new Node(data);
        else if(root.data > data) root.left = insertData(root.left, data);
        else if(root.data < data) root.right = insertData(root.right, data);
        return root;
    }
    private int minValue(Node root) {
        int minValue = root.data;
        while(root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    private int maxValue(Node root) {
        int maxValue = root.data;
        while(root.right != null) {
            maxValue = root.right.data;
            root = root.right;
        }
        return  maxValue;
    }
    private Node deleteKey(Node root, int key) {
        // Search for the element if that exists in the BST or not
        if(root == null) return null;
        else {
            if(key < root.data) root.left = deleteKey(root.left, key);
            else if(key > root.data) root.right = deleteKey(root.right, key);
            // key == root.data
            else {
                // Case_1 - if(root.left == null && root.right == null) | leaf node
                // Case_2 - if(root.left == null || root.right == null) | Node w one child.
                if(root.left == null) return root.right;
                else if(root.right == null) return root.left;
                // Case_3 - if(root.left != null && root.right != null) | Node w two children
                else {
                    // Way 1 -> Replace with the smallest element from the right subtree
                    root.data = minValue(root.right);
                    root.right = deleteKey(root.right, root.data);
                    // Way 2 -> Replace with the largest element from the left subtree
                    // root.data = maxValue(root.left);
                    // root.left = deleteKey(root.left, root.data);
                }
            }
        }
        return root;
    }
    private Node searchKey(Node root, int key) {
        if(root == null || root.data == key) return root;
        else if(key < root.data) return searchKey(root.left, key);
        else return searchKey(root.right, key);
    }
    private void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);        // L
            System.out.print(root.data + " ");  // D
            inOrderTraversal(root.right);       // R
        }
    }
    private void preOrderTraversal(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");    // D
            preOrderTraversal(root.left);         // L
            preOrderTraversal(root.right);        // R
        }
    }
    private void postOrderTraversal(Node root) {
        if(root != null) {
            postOrderTraversal(root.left);      // L
            postOrderTraversal(root.right);     // R
            System.out.print(root.data + " ");  // D
        }
    }
    private void reverseOrderTraversal(Node root) {
        if(root != null) {
            reverseOrderTraversal(root.right);  // R
            System.out.print(root.data + " ");  // D
            reverseOrderTraversal(root.left);   // L
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
        bst.insert(1);
        // NOTE :- The inOrder of any BSt will always be in ascending order!
        bst.inOrder();                                                                  // 1 6 12 21 23 43 45 78 90
        // NOTE :- The first element in the preOrder will always be root.
        bst.preOrder();                                                                 // 45 6 1 12 23 21 43 78 90
        // NOTE :- The last element in the postOrder will always be root.
        bst.postOrder();                                                                // 1 21 43 23 12 6 90 78 45
        // NOTE :- In case of decreasing order, change the inOrder from LDR to DLR
        bst.reverseOrder();                                                             // 90 78 45 43 23 21 12 6 1
        System.out.println(bst.search(78));                                         // true
        System.out.println(bst.search(100));                                       // false
        bst.delete(43);
        bst.inOrder();                                                                  // 1 6 12 21 23 45 78 90
    }
}
