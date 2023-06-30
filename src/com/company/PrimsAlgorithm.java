package com.company;

import java.util.Scanner;

public class PrimsAlgorithm {
    int V; int[][] graph;
    PrimsAlgorithm(int V) {
        this.V = V;
        this.graph = new int[V][V];
    }
    public void primsMST(int[][] graph) {
        // Step1 -> keep a track of cost & visited
        boolean[] visited = new boolean[V];
        int[] cost = new int[V];
        // Step2 -> initialise the values of visited & cost
        for(int i=0; i < V; i++) {
            visited[i] = false;
            cost[i] = Integer.MAX_VALUE;
        }
        // Step3 -> select a start point for the traversal
        cost[0] = graph[0][0];
        // Step4 -> total number of edges required (V-1)
        for(int i=0; i < V-1; i++) {
            // algorithm tries to find that index which
            // is least in cost and is not visited
            int u = minVertex(visited, cost);
            // Step4:- Explore the neighbors of u, also mark u as visited
            visited[u] = true;
            for(int v=0; v < V; v++) {  // u = 0; v = 0 1 2 3 4 5 6 7 8
                // with an edge && should not be visited && min cost
                if(graph[u][v] != 0 && !visited[v] && graph[u][v] < cost[v]) {
                    cost[v] = graph[u][v];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        PrimsAlgorithm pa = new PrimsAlgorithm(V);
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                pa.graph[i][j] = sc.nextInt();
            }
        }
        // a utility function which takes in the graph, and prints the MST.
        pa.primsMST(pa.graph);
    }
}
