package com.company;

import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pI = start;
        for(int i=start; i < end; i++) {
            if(arr[i] <= pivot) {
                // swap(arr[i], arr[pI]
                int temp = arr[i];
                arr[i] = arr[pI];
                arr[pI] = temp;
                pI++;
            }
        }
        // swap(arr[pi], arr[end])
        int temp = arr[pI];
        arr[pI] = arr[end];
        arr[end] = temp;

        return pI;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pI = partition(arr, start, end);
            quickSort(arr, start, pI-1);
            quickSort(arr, pI+1, end);
        }
    }
    public static void printArray(int[] arr) {
        for(int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        // print the array before sorting
        printArray(arr);
        // sort it based on quick_sort
        quickSort(arr, 0, n-1);
        // print the array after sorting
        printArray(arr);
    }
}
