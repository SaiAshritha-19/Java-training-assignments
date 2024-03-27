package org.example.assignment3;

import java.util.List;
import java.util.Optional;

public class EmployeeFinder {
    public static Optional<Employee> findEmployeeWithSkill(List<Employee> employees, String skill) {
        return employees.stream()
                .filter(e -> e.getSkill().equalsIgnoreCase(skill))
                .findFirst();
    }
}

