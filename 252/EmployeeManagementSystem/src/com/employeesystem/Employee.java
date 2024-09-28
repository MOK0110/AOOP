package com.employeesystem;

public class Employee implements Comparable<Employee>, Cloneable {
    private int employeeID;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Override compareTo to sort employees by salary
    @Override
    public int compareTo(Employee otherEmployee) {
        return Double.compare(this.salary, otherEmployee.salary);
    }

    // Cloneable implementation
    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + name + ", Department: " + department + ", Salary: $" + salary;
    }
}
