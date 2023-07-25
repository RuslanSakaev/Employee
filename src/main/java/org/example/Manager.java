package org.example;

public class Manager extends Employee {
    public Manager(String fullName, String position, String phoneNumber, double salary, int age) {
        super(fullName, position, phoneNumber, salary, age);
    }

    // Переопределение статического метода для повышения зарплаты всем сотрудникам, кроме руководителей
    public static void increaseSalaryForOlderEmployees(Employee[] employees, int ageThreshold, double increaseAmount) {
        for (Employee employee : employees) {
            if (employee != null && !(employee instanceof Manager) && employee.getAge() > ageThreshold) {
                employee.setSalary(employee.getSalary() + increaseAmount);
            }
        }
    }
}
