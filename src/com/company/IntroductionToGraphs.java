package com.company;

import java.util.Scanner;

public class IntroductionToGraphs {
    int V;
    int[][] graph;                                                          // Adjacency Matrix
    IntroductionToGraphs(int vertex) {
        this.V = vertex;
        this.graph = new int[V][V];
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
1 0 1 1 1 0
0 1 0 1 1 1
1 1 1 0 1 0
0 1 1 1 0 1
1 0 1 0 1 0
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();                                               // The total no of vertices in the graph
        IntroductionToGraphs g = new IntroductionToGraphs(6);
        // input of the graph from the user
        for(int i=0; i < V; i++) {                                          // i = 0, 1, 2, 3, 4, 5
            for(int j=0; j < V; j++) {                                      // j = 0, 1, 2, 3, 4, 5
                g.graph[i][j] = sc.nextInt();
            }
        }
        g.display();
    }
}
