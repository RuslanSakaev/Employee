package org.example;

public class Employee {
    private String fullName;
    private String position;
    private String phoneNumber;
    private double salary;
    private int age;

    // Конструктор класса
    public Employee(String fullName, String position, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Геттеры и сеттеры для доступа к полям
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return String.format("Full Name: %s\nPosition: %s\nPhone Number: %s\nSalary: %.2f\nAge: %d",
                fullName, position, phoneNumber, salary, age);
    }
    // Статический метод для повышения зарплаты сотрудников старше определенного возраста
    public static void increaseSalaryForOlderEmployees(Employee[] employees, int ageThreshold, double increaseAmount) {
        for (Employee employee : employees) {
            if (employee != null && employee.getAge() > ageThreshold) {
                employee.setSalary(employee.getSalary() + increaseAmount);
            }
        }
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

