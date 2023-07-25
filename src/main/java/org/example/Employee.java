package org.example;

public class Employee {
    private final String fullName;
    private final String position;
    private final String phoneNumber;
    private double salary;
    private final int age;

    public Employee(String fullName, String position, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Геттеры и сеттеры

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s\nДолжность: %s\nТелефон: %s\nЗарплата: %.2f\nВозраст: %d",
                fullName, position, phoneNumber, salary, age);
    }
    // Статический метод для вычисления среднего возраста сотрудников
    public static double calculateAverageAge(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return 0.0;
        }

        int totalAge = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalAge += employee.getAge();
            }
        }

        return (double) totalAge / employees.length;
    }
    // Статический метод для вычисления средней зарплаты сотрудников
    public static double calculateAverageSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return 0.0;
        }

        double totalSalary = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }

        return totalSalary / employees.length;
    }
}

