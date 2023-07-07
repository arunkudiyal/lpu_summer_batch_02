package com.company;

import java.util.Scanner;

public class MatrixChainMultiplication {
    public int matrixChainMultiplication(int n, int[] arr) {
        int m = n-1;
        int[][] table = new int[m][m];
        for(int length = 2; length <= m; length++) {
            for(int i=0; i < m-length+1; i++) {
                int j = i + length - 1;
                table[i][j] = Integer.MAX_VALUE;
                for(int k=i; k < j; k++) {
                    int cost = table[i][k] + table[k+1][j] + (arr[i] * arr[j+1] * arr[k+1]);
                    if(cost < table[i][j]) table[i][j] = cost;
                }
            }
        }
        return table[1][n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        MatrixChainMultiplication mcm = new MatrixChainMultiplication();
        int answer = mcm.matrixChainMultiplication(n, arr);
        System.out.println(answer);
    }
}
