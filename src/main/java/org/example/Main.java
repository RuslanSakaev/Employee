package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Manager", "+1 123-456-7890", 5000.0, 35);
        System.out.println(employee.toString());
    }
}
