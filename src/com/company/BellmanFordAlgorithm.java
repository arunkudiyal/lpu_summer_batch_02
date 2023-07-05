package com.company;

import java.util.Scanner;

public class BellmanFordAlgorithm {
    int V; int[][] graph; int[] cost;
    BellmanFordAlgorithm(int V) {
        this.V = V;
        this.graph = new int[V][V];
        this.cost = new int[V];
        // initial values of cost
        for(int i=0; i < V; i++)
            cost[i] = Integer.MAX_VALUE;
    }
    public void bellmanFord(int source) {
        cost[source] = graph[source][source];
        // repeatedly relax all vertices by visiting the edges [-ve, +ve] for V-1 times
        for(int i=0; i < V-1; i++) {
            // explore all the edges
            for(int u=0; u < V; u++) {
                for(int v=0; v < V; v++) {
                    if(graph[u][v] != 0) {
                        // Relax all the vertices connected to the edge
                        if(cost[v] > cost[u] + graph[u][v])
                            cost[v] = cost[u] + graph[u][v];
                    } else if(graph[u][v] < 0) {
                        if(cost[v] > cost[u] + graph[u][v])
                            cost[v] = cost[u] + graph[u][v];
                    }
                }
            }
            for(int k=0; k < V; k++)
                System.out.print(cost[k] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        BellmanFordAlgorithm bfa = new BellmanFordAlgorithm(V);
        // Graph input
        for(int u=0; u < V; u++) {
            for(int v=0; v < V; v++) {
                bfa.graph[u][v] = sc.nextInt();
            }
        }
        bfa.bellmanFord(0);
        System.out.println();
    }
}
