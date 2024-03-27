package org.example.assignment4;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private int experience;
    private double salary;
    private String department;

    public Employee(String name, int age, int experience, double salary, String department) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ashritha", 30, 5, 50000, "HR"),
                new Employee("Priya", 25, 3, 45000, "Engineering"),
                new Employee("Sai", 35, 8, 60000, "HR"),
                new Employee("Nandini", 28, 6, 55000, "Engineering"),
                new Employee("Bob", 40, 10, 70000, "Finance")
        );

        // Total number of employees
        long totalEmployees = employees.stream().count();
        System.out.println("Total number of employees: " + totalEmployees);

        // Group employees by department
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees grouped by department: " + employeesByDepartment);

        // Total salary paid to all employees
        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total salary paid to all employees: " + totalSalary);

        // Total salary paid to employees of each department
        Map<String, Double> totalSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)));
        System.out.println("Total salary paid to employees of each department: " + totalSalaryByDepartment);

        // Sort employees based on age
        List<Employee> employeesSortedByAge = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by age: " + employeesSortedByAge);

        // Sort employees based on experience
        List<Employee> employeesSortedByExperience = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getExperience))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by experience: " + employeesSortedByExperience);
    }
}
