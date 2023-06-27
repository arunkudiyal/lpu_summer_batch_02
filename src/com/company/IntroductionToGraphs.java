package com.company;

import java.util.Scanner;

public class IntroductionToGraphs {
    int V;
    int[][] graph;                                                          // Adjacency Matrix
    IntroductionToGraphs(int vertex) {
        this.V = vertex;
        this.graph = new int[V][V];
    }
    // Q:- You are given with a graph G, create a function getEdges(), which returns the count of edges in the graph.
    public int getEdges() {
        int count = 0;
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                if(graph[i][j] == 1) count+=1;
            }
        }
        // non-digraph, i.e. 2 entries for one single edge
        return count/2;
    }
    // Q:- Given a graph G, create a function containsSelfLoop, if any vertex in the Graph contains a self loop
    public boolean containsSelfLoop() {
        // v = 6, i = 0, 1, 2, 3, 4, 5, 00, 11, 22, ...
        for(int i=0; i < V; i++) if(graph[i][i] == 0) return false;
        return true;
    }
    public int countSelfLoop() {
        int count = 0;
        for(int i=0; i < V; i++) {
            if(graph[i][i] == 1) count+=1;
        }
        return count;
    }
    public void display() {
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
/*
6
0 1 0 1 0 1
1 1 1 1 1 0
0 1 1 1 1 1
1 1 1 0 1 0
0 1 1 1 0 1
1 0 1 0 1 0
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();                                                                   // The total no of vertices in the graph
        IntroductionToGraphs g = new IntroductionToGraphs(6);
        // input of the graph from the user
        for(int i=0; i < V; i++) {                                                              // i = 0, 1, 2, 3, 4, 5
            for(int j=0; j < V; j++) {                                                          // j = 0, 1, 2, 3, 4, 5
                g.graph[i][j] = sc.nextInt();
            }
        }
        g.display();
        System.out.println("No of edges in Graph - " + g.getEdges());                           // 11
        System.out.println("Does G contains any self loop - " + g.containsSelfLoop());          // true
        System.out.println("Count of self loop in graph - " + g.countSelfLoop());               // 2
    }
}
