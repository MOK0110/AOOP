package com.employeesystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSystem {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create some employees
        Employee emp1 = new Employee(1, "Alice", "HR", 50000);
        Employee emp2 = new Employee(2, "Bob", "IT", 60000);
        Employee emp3 = new Employee(3, "Charlie", "Finance", 55000);

        // Clone an employee
        Employee clonedEmp = emp1.clone();

        // Store employees in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Sort using Comparable (by salary)
        Collections.sort(employeeList);
        System.out.println("Employees sorted by salary (Comparable):");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        // Sort using Comparator (by name)
        Collections.sort(employeeList, new EmployeeComparator());
        System.out.println("\nEmployees sorted by name (Comparator):");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        // Iterate over the employees using Iterator
        EmployeeIterator employeeIterator = new EmployeeIterator(employeeList);
        System.out.println("\nIterating over employees:");
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
    }
}
