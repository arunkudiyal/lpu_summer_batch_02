package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BFSGraph {
    int V;
    int[][] graph;
    BFSGraph(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        // initially when there is no exploration
        for(int i=0; i < V; i++) visited[i] = false;
        // ArrayList to maintain the check
        ArrayList<Integer> q = new ArrayList<>();
        q.add(start);
        visited[start] = true;
        int current;
        while(!q.isEmpty()) {
            current = q.get(0);
            System.out.print(current + " ");
            q.remove(q.get(0));
            for(int i=0; i < V; i++) {                              // 0, 1, 2, 3, 4, 5
                if(graph[current][i] == 1 && (!visited[i])) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        BFSGraph g = new BFSGraph(V);                                           // V = 6, graph[6][6]
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                g.graph[i][j] = sc.nextInt();
            }
        }
        g.BFS(0);
    }
}
