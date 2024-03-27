package org.example.assignment3;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String skill;

    public Employee(int id, String name, double salary, String skill) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skill='" + skill + '\'' +
                '}';
    }
}



