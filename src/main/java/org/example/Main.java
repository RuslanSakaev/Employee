package org.example;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Создаем массив для хранения 6 сотрудников
        Employee[] employees = new Employee[6];

        // Создаем объекты сотрудников и помещаем их в массив
        employees[0] = new Employee("Иванов Сергей Иванович", "Разработчик", "+7-345-67-89", 50000, 30);
        employees[1] = new Employee("Петров Николай Васильевич", "Дизайнер", "+7-987-654-43-21", 45000, 35);
        employees[2] = new Employee("Тёркин Дмитрий Петрович", "Менеджер", "+7-555-123-45-56", 60000, 50);
        employees[3] = new Employee("Лаврова Анна Сергеевна", "Инженер-тестировщик", "+7-111-222-33-33", 48000, 42);
        employees[4] = new Employee("Маркин Лев Дмитриевич", "Разработчик", "455-56-66", 52000, 28);
        employees[5] = new Manager("Валерева Александра Дмитриевна", "Старший менеджер", "778-88-99", 80000, 55);

        // Выводим информацию о сотрудниках до повышения зарплаты
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
                System.out.println("--------------------");
            }
        }

        // Повышаем зарплату сотрудникам старше 45 лет, не являющимся руководителями, на 5000
        int ageThreshold = 45;
        double increaseAmount = 5000.0;
        Manager.increaseSalaryForOlderNonManagers(employees, ageThreshold, increaseAmount);

        // Выводим информацию о сотрудниках после повышения зарплаты
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
                System.out.println("--------------------");
            }
        }
        // Вычисляем и выводим средний возраст и среднюю зарплату сотрудников
        double averageAge = Employee.calculateAverageAge(employees);
        double averageSalary = Employee.calculateAverageSalary(employees);

        // Округляем средний возраст и среднюю зарплату до двух знаков после запятой
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String formattedAverageAge = decimalFormat.format(averageAge);
        String formattedAverageSalary = decimalFormat.format(averageSalary);

        System.out.println("Средний возраст сотрудников: " + formattedAverageAge);
        System.out.println("Средняя зарплата сотрудников: " + formattedAverageSalary);
    }
}

