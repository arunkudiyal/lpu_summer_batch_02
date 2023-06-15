package com.company;

import java.util.Scanner;

public class FibonacciSeries {
    // Step 1:- Create a memo to store the values.
    public static long[] memo;
    public static long fib_memo(int n) {
        // Step 2:- To find the base cases
        if(n == 0) return 0;
        if(n == 1) return 1;
        // Step 3:- check if the memo has the result or not
        if(memo[n] != 0) return memo[n];
        // Step 4:- if the memo does not have the result, will find the result and store in the memo
        memo[n] = fib_memo(n-1) + fib_memo(n-2);
        // Step 5:- Once the value is stored, return the result
        return memo[n];
    }
    public static long fibonacci(int n) {
        // I will create a memo(space where I store intermediate results) for the code
        memo = new long[n+1];
        // give the memo some initial values -> 0 to indicate that no value is calculated or stored;
        for(int i=0; i < n; i++)
            memo[i] = 0;
        return fib_memo(n);
    }
    public static int fib(int term) {
        if(term == 1) return 0;
        if(term == 2) return 1;
        return fib(term-1) + fib(term-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long value = fibonacci(n);
        System.out.println(value);
    }
}
