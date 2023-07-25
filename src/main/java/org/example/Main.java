package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иванов Сергей Петрович", "Manager", "+7 123-456-78-90", 5000.0, 35);
        System.out.println(employee.toString());
    }
}
