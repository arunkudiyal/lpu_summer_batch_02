package com.company;

import java.util.Scanner;

// Java is an OOP.
// package --> A collection of java class
// Default Package -> java.lang
class Main {
    public static void main(String[] args) {
        // Display a message :- ( cout << "" , printf("") )
        System.out.println("Hello World!");
        System.out.print("Hello...World...");
        System.out.println();

        // Primitive Data Types (PDTs) --> Statically Typed Language
        byte one = -128; // size -> 1 byte, range -> -128 to +127
        short two = 32767; // size -> 2 bytes, range -> -32768 to +32767
        int three = 40000; // size -> 4 bytes, rage -> -2^31 to 2^31 - 1
        float four = 3.000000000000000000000000014f;        // 7 decimal places
        double five = 3.000000000000000000000000014;        // 13 decimal places
        boolean six = true; // size - 1 byte, range -> T/F
        long seven = 1000000078; // size -> 8 bytes, rage -> -2^62 to 2^62 - 1

        // Input or Output
        // Input --> 1. Scanner Class --> a.) import the class, b.) create an object, 3.) taking the ip from user
        // Syntax -> Scanner objectName = new Scanner(System.in)

        // Research --> How to take a char and string as an input from the Scanner class.
        // IMP :- Scanner has two delimiters --> space and enter
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean isOk = sc.nextBoolean();
        System.out.println(num1 + num2);
    }
}