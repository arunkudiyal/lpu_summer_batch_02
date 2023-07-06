package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public int[] lis(int[] numbers) {
        int n =  numbers.length;
        int[] memo = new int[n];
        Arrays.fill(memo, 1);
        for(int i=1; i < n; i++) {
            for(int j=i-1; j >= 0; j--) {
                // subsequence is not increasing
                if(numbers[j] >= numbers[i]) continue;
                int possibleAns = memo[j] + 1;
                if(possibleAns > memo[i]) memo[i] = possibleAns;
            }
        }
        return memo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i < n; i++)
            numbers[i] = sc.nextInt();
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] result = lis.lis(numbers);
        for(int i=0; i < n; i++)
            System.out.print(result[i] + " ");
        System.out.println();
    }
}
