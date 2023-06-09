package com.company;

// Class :- A template which helps you build real-life entities.
// Objects :- the real-life entities built using the class are objects
class Student {
    // Data Members (PROPERTIES) :- Are the data, relative to the objects of the class.
    String name; int r_no; String batch; int age;
    // Member Functions (METHODS) :- Are the functions which could be used by the objects of the class
    public void display() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " and I am from " + batch + " batch.");
    }
    // Constructors -> A way of initialising the data members of the class, at the time when you will be creating the object.
    // 1. Default (Non-Parametrised) -> are created by compiler           2. Parametrised
    // NOTE :- You cannot use default constructor for creating an object if a parameterised constructor is defined, unless specified.
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Student(int r_no, String batch, int age, String name) {
        // this.dataMember = parameterName
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.r_no = r_no;
    }
}

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // Create Object
        // Syntax :- ClassName objectName = new Constructor();
        // Constructor have the same name as that of the class.
        // Student studentOne = new Student();
        Student studentOne = new Student(101234, "PEP_2023", 21, "Dhiraj");
        Student studentTwo = new Student("Aman", 20);
        studentOne.display();                   // Default values of DM. String -> null, integer/byte -> 0, double/float -> 0.0, boolean -> false.
        studentTwo.display();
        System.out.println(studentOne);         // Reference Variables -> A variable which helps you refer to a context (address)
    }
}
