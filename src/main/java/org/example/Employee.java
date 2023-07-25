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
}

