package com.company;

import java.util.Scanner;

class Node {
    Node[] children = new Node[26];
    boolean eow;
    Node() {
        for(int i=0; i < 26; i++)
            this.children[i] = null;
        this.eow = false;
    }
}
class Trie {
    Node root;
    Trie() {
        root = new Node();
    }
    public void insert(String word) {
        Node temp = root;
        for(int i=0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(temp.children[index] == null)
                temp.children[index] = new Node();
            temp = temp.children[index];
        }
        temp.eow = true;
    }
    public boolean search(String key) {
        int index;
        int length = key.length();
        Node temp = root;
        for(int level=0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if(temp.children[index] == null) return false;
            temp = temp.children[index];
        }
        return temp.eow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // no of words in the S
        int n = sc.nextInt();
        String[] S = new String[n];
        for(int i=0; i < n; i++)
            S[i] = sc.next();
        Trie trie = new Trie();
        for(int i=0; i < n; i++)
            trie.insert(S[i]);
        // Value to be matched
        String toBeMatched = sc.next();
        boolean ans = trie.search(toBeMatched);
        if(ans) System.out.println(toBeMatched + " is available in S");
        else System.out.println(toBeMatched + " is not available in S");
    }
}
