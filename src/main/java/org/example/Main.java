package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем массив для хранения 5 сотрудников
        Employee[] employees = new Employee[6];

        // Создаем объекты сотрудников и помещаем их в массив
        employees[0] = new Employee("Иванов Сергей Иванович", "Developer", "+7-345-67-89", 50000, 30);
        employees[1] = new Employee("Петров Николай Васильевич", "Designer", "+7-987-654-43-21", 45000, 35);
        employees[2] = new Employee("Тёркин Дмитрий Петрович", "Manager", "+7-555-123-45-56", 60000, 50);
        employees[3] = new Employee("Лаврова Анна Сергеевна", "QA Engineer", "+7-111-222-33-33", 48000, 42);
        employees[4] = new Employee("Маркин Лев Дмитриевич", "Developer", "455-56-66", 52000, 28);

        // Выводим информацию о сотрудниках до повышения зарплаты
        for (Employee employee : employees) {
            if (employee != null) { // Проверяем на null перед вызовом toString()
                System.out.println(employee.toString());
                System.out.println("--------------------");
            }
        }

        // Повышаем зарплату сотрудникам старше 45 лет на 5000
        int ageThreshold = 45;
        double increaseAmount = 5000.0;
        Employee.increaseSalaryForOlderEmployees(employees, ageThreshold, increaseAmount);

        // Выводим информацию о сотрудниках после повышения зарплаты
        for (Employee employee : employees) {
            if (employee != null) { // Проверяем на null перед вызовом toString()
                System.out.println(employee.toString());
                System.out.println("--------------------");
            }
        }
    }
}
