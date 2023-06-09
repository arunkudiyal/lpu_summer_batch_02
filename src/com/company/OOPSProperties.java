package com.company;

class Employee {
    private int emp_id; private String name; private String bGroup; private String designation;
    Employee(int emp_id, String name, String bGroup, String designation) {
        this.emp_id = emp_id;
        this.name = name;
        this.bGroup = bGroup;
        this.designation = designation;
    }
    // Getters ( getProperty() ) and Setters ( setProperty(newProperty) ) -> Help you read and update the data members, BUT NOT DIRECTLY...
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // NOTE:- In case of any change in return type but no change in name and parameter(s), then it is NOT polymorphism.
    // public int display() {}
    public void display() {
        System.out.println("Employee Id - " + this.emp_id + " Employee Name - " + this.name + " Employee Blood Group - " + this.bGroup );
    }
    public void display(String name) {
        System.out.println("Name is :- " + name);
    }

    public void show(int emp_id, String emp_name) {
        System.out.println("EMP ID - " + emp_id + " | EMP NAME - " + emp_name);
    }
    public void show(String emp_name, int emp_id) {
        System.out.println("EMP ID - " + emp_id + " | EMP NAME - " + emp_name);
    }
}

public class OOPSProperties {
    public static void main(String[] args) {
        // 1. Encapsulation :- Combination of data members (properties) and member functions (methods) in one single unit called class.
        // 2. Abstraction :- Hiding the implementation details from the user, which are of no use to the user. We use access modifier / access specifier.
        // 3. Polymorphism :- Poly(many) + Morph(Forms) :- Any method which consist itself in many form.
        // Research Work :- CompileTime Polymorphism & RunTime Polymorphism
        // 4. Inheritance :- 1. Abstract Class              2. Interface
        Employee emp1 = new Employee(10273611, "Employee One", "A+", "Sr. Manager");
        emp1.display();
        emp1.display("Arun Kudiyal");
        emp1.setName("Emp One");
        System.out.println("Name of first employee is " + emp1.getName());
    }
}
