package com.company;
import java.util.Scanner;
public class DijkstraAlgorithm {
    int V;
    int[][] graph;
    DijkstraAlgorithm(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    public int[] dijkstraAlgorithm(int[][] graph, int source) {
        boolean[] visited = new boolean[V];
        int[] cost = new int[V];
        for(int i=0; i < V; i++) {
            visited[i] = false;
            cost[i] = Integer.MAX_VALUE;
        }
        // set the source
        cost[source] = graph[source][source];
        for(int i=0; i < V-1; i++) {
            int u = minVertex(visited, cost);
            visited[u] = true;
            for(int v=0; v < V; v++) {
                if(graph[u][v] != 0 && !visited[v] && graph[u][v] <= cost[v]) {
                    cost[v] = cost[u] + graph[u][v];
                }
            }
        }
        return cost;
    }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        DijkstraAlgorithm algo = new DijkstraAlgorithm(V);
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                algo.graph[i][j] = sc.nextInt();
            }
        }
        int source = sc.nextInt();
        int destination = sc.nextInt();
        int[] minCostPath = algo.dijkstraAlgorithm(algo.graph, source);
        System.out.println(minCostPath[destination]);
    }
}
