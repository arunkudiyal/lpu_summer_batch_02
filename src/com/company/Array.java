package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Arrays :- It is a linear DSA, which allows you to contain multiple values in a single variable
        // 1. Arrays in java is uni-set (of a single data type)
        // 2. Arrays can help you store values, but you need to access them using indices (starts with 0)

        // Syntax -> datatype[] array_name = { a, b, c, d, ... };
         byte[] arr = {10, 15, 20, 30, 45, 100};
         // index -> 0, 1, 2, 3, 4, 5
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5]);
        System.out.println(arr.length);

        // Syntax -> when you have the size of the array, but not the values.
        // datatype[] array_name = new datatype[size];
        // int[] array = new int[5];

        // Q:- Given a size from the user, take the input from the user and display the values.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();                // 5
        int[] array = new int[size];
        System.out.println("The value of the array is - " + array);             // Reference Variable (Address)
        // taking the array input
        for(int i=0; i < size; i++)             // i = 0, 1, 2, 3, 4
            // array[0] = sc.nextInt(), array[1] = sc.nextInt()
            array[i] = sc.nextInt();
        // display
        for(int i=0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
