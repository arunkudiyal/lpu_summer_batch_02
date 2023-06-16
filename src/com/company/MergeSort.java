package com.company;

import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        // copying the data
        for(int i=0; i < n1; i++)
            L[i] = arr[start+i];
        for(int i=0; i < n2; i++)
            R[i] = arr[(mid+1) + i];
        int i = 0; int j = 0; int k = start;
        while(i < n1 && j < n2) {
            if(L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copying the remaining elements if any L or R is finished.
        while(i < n1) { arr[k] = L[i]; i++; k++; }
        while(j < n2) { arr[k] = R[j]; j++; k++; }
    }
    public static void mergeSort(int[] arr, int start, int end) {
        // recursive code
        // base condition -> the recursion will stop
        if(start < end) {
            int mid = (start + end) / 2;
            // divide the array into 2 parts LArray[start...mid] & RArray[mid+1...end]
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void printArray(int[] arr) {
        for(int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   // cin >> n
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();              // 5 4 6 2 1 3
        // print the array before sorting
        printArray(arr);
        // sort the array using merge sort
        mergeSort(arr, 0, n-1);
        // print the array after sorting
        printArray(arr);
    }
}
