package com.company;

// Class v/s Interface
class AA {
    int prop1; String prop2;
    public AA() { }
    public AA(int prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }
    public void display() {
        System.out.println("Property One -> " + this.prop1 + " | Property Two -> " + this.prop2);
    }
}
interface Demo {
    // Properties | Data Members :- The properties are always kept static (which do not change)
    double propOne = 3.14; String propTwo = "My Interface";
    // Constructors :- You cannot create constructors in Interfaces.
    // Methods | Member Functions :- If you create a method / function, you cannot give business logic (body) to the function.
    public void display();
}
// NOTE :- You can inherit (implements) the interfaces to a class; You are now supposed to give the body of all the methods in the interface.
//class D implements Demo {
//    public void display() {
//        System.out.println("Displaying from the interface...");
//    }
//}

// Implement Multiple Inheritance using Interfaces
//public class InterfaceExample extends AA implements Test {
//    public static void main(String[] args) {
//
//    }
//}
