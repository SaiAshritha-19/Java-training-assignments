package org.example.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeRecordsApp {
    public EmployeeRecordsApp() {
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList();
        employees.add(new Employee("5001", "Sai", "IT", 50000.0));
        employees.add(new Employee("5002", "Ashu", "HR", 60000.0));
        employees.add(new Employee("5003", "Smith", "Finance", 55000.0));
        employees.add(new Employee("5001", "John", "IT", 50000.0));
        Set<String> employeeIds = EmployeeRecordsManager.extractEmployeeIds(employees);
        List<String> sortedEmployeeIds = EmployeeRecordsManager.removeDuplicateAndSort(employeeIds);
        Map<String, Employee> employeeInfoMap = EmployeeRecordsManager.mapEmployeeInfo(employees);
        Iterator var5 = sortedEmployeeIds.iterator();

        while(var5.hasNext()) {
            String id = (String)var5.next();
            Employee employee = (Employee)employeeInfoMap.get(id);
            if (employee != null) {
                System.out.println("Employee ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Department: " + employee.getDepartment());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println();
            }
        }

    }
}
