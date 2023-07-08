package com.company;

import java.util.Scanner;

public class Trie {
    static Node root;
    Trie() {}
    static class Node {
        Node[] children = new Node[26];
        boolean eow;
        Node() {
            this.eow = false;
            for(int i=0; i < 26; i++)
                children[i] = null;
        }
    }
    public static void insert(String word) {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // total number of words
        int n = sc.nextInt();
        // set 'S' contains all the words in the Set
        String[] S = new String[n];
        for(int i=0; i < n; i++)
            S[i] = sc.nextLine();
        String P = sc.nextLine();
        for(int i=0; i < n; i++)
            insert(S[i]);
    }
}
