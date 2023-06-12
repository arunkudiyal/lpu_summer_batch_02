package com.company;
// Abstract Class :-
  abstract class Test {
    // Properties | Data Members
    int prop1; String prop2; boolean prop3;
    // Constructors
    public Test(int prop1, String prop2, boolean prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }
    // Methods | Member Functions :- If you create a method / function, you cannot give business logic (body) to the function.
    // NOTE:- Abstract class is also a class, if you want, you can contain concrete methods in the abstract class.
    // but if you want you can also create abstract methods (which do not have the body) in abstract classes.
    public void display() {
        System.out.println("Hello... this is the display() method!");
    }
    public abstract void show();
}
public class AbstractClassExample {
    public static void main(String[] args) {

    }
}
