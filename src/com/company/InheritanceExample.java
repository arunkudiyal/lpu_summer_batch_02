package com.company;
// inheritance -> Way to access and modify the data from one class to another. (extends)
// PROBLEM -> If I wanted class B to contain the combination of int, String, double and boolean.
// NOTE -> All the properties / methods & even constructors which are kept public can now be accessed.
// In order to access the constructor of the parent class, you use a keyword " super() "
// Parent class / Super Class -> The class whose properties are inherited.
// Child Class / Sub Class -> The class which inherits the properties.
class A {
    int prop1; String prop2;
    public A(int prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }
    public void display() {
        System.out.println("Property One -> " + this.prop1 + " | Property Two -> " + this.prop2);
    }
}
class B extends A {
    double prop3; boolean prop4;
    public B(int prop1, String prop2, double prop3, boolean prop4) {
        // call the parent constructor and pass prop1 & prop2 to class A
        super(prop1, prop2);
        this.prop3 = prop3;
        this.prop4 = prop4;
    }
    public void display() {
        System.out.println("Property One -> " + this.prop1 + " | Property Two -> " + this.prop2 + " | Property Three -> " + this.prop3 + " | Property Four -> " + this.prop4);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        B objectB = new B(100, "Hello", 3.14, false);
        objectB.display();
    }
}
