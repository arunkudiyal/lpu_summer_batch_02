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
        int[] parent = new int[V];
        // Step2 -> initialise the values of visited & cost
        for(int i=0; i < V; i++) {
            visited[i] = false;
            cost[i] = Integer.MAX_VALUE;
        }
        // Step3 -> select a start point for the traversal
        // cost[source] = graph[source][source]
        cost[0] = graph[0][0];
        parent[0] = -1;
        // Step4 -> total number of edges required (V-1)
        for(int i=0; i < V-1; i++) {
            // algorithm tries to find that index which
            // is least in cost and is not visited
            int u = minVertex(visited, cost);
            // Step4:- Explore the neighbors of u, also mark u as visited
            visited[u] = true;
            for(int v=0; v < V; v++) {  // u = 0; v = 0 1 2 3 4 5 6 7 8
                // with an edge && should not be visited && min cost
                if(graph[u][v] != 0 && !visited[v] && graph[u][v] <= cost[v]) {
                    parent[v] = u;
                    cost[v] = graph[u][v];
                }
            }
        }
        // Print the value of cost array
        //        int total_cost = 0;
        //        for(int i=0; i < V; i++)
        //            total_cost += cost[i];
        //        System.out.println(total_cost);
                System.out.println("---- x -----");
                for(int i=0; i < V; i++)
                    System.out.print(cost[i] + " ");
                System.out.println();

        // Create a display() function such that I print the cost of each edge with a source 'S' and a destination 'D'
        // display(parent, this.graph);
    }
    public void display(int[] parent, int[][] graph) {
        System.out.println("S_To_D\tCost");
        for(int i=1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }
    // 8 7 9 2 1 8 2
    public int minVertex(boolean[] visited, int[] cost) {
        int min_vertex = -1; int min = Integer.MAX_VALUE;
        for(int i=0; i < V; i++) {
            if(cost[i] <= min && !visited[i]) {
                min = cost[i];
                min_vertex = i;
            }
        }
        return min_vertex;
    }
/*
9
0 4 0 0 0 0 0 8 0
4 0 8 0 0 0 0 11 0
0 8 0 7 0 4 0 0 2
0 0 7 0 9 14 0 0 0
0 0 0 9 0 10 0 0 0
0 0 4 14 10 0 2 0 0
0 0 0 0 0 2 0 1 6
8 11 0 0 0 0 1 0 7
0 0 2 0 0 0 1 7 0
*/
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
