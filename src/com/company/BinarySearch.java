package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int n, int[] arr, int k) {
        // if the data is not sorted --> Arrays.sort(arr)
        Arrays.sort(arr);
        int start = 0; int end = n-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == k) return mid;
            if(arr[mid] < k) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int index = binarySearch(n, arr, k);
        System.out.println(index);
    }
}
