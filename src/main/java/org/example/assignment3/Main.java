package org.example.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(111, "John", 50000, "Java"));
        employees.add(new Employee(211, "Sai", 60000, "Python"));
        employees.add(new Employee(311, "Bob", 55000, "C++"));
        employees.add(new Employee(312, "Aswin", 55000, "C++"));

        Optional<Employee> employeeWithPythonSkill = EmployeeFinder.findEmployeeWithSkill(employees, "Python");
        if (employeeWithPythonSkill.isPresent()) {
            System.out.println("Employee with Python skill found: " + employeeWithPythonSkill.get());
        } else {
            System.out.println("No employee with Python skill found");
        }
    }
}


