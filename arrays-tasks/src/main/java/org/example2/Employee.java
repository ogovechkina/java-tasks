package org.example2;

public class Employee {
    private final String fullName;
    private String position;
    private String phone;
    private double salary;
    private final int age;

    public Employee(String fullName, String position, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.printf("%-25s - %-15s (age %d, salary %6.0f)\n", fullName, position, age, salary);
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double amount) {
        this.salary = this.salary + amount;
    }

    public int getAge() {
        return age;
    }
}
