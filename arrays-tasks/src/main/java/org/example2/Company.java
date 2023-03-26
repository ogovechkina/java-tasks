package org.example2;

public class Company {
    public static final int AGE_40 = 40;
    public static final int AGE_45 = 45;
    public static final double INCREASE_IN_SALARY = 5000;

    private final Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void printEmployees() {
        System.out.println("------ Employees ------");
        for (int i = 0; i < employees.length; i++) {
            employees[i].print();
        }
    }

    public void printEmployeesOlderThen(int age) {
        System.out.println("------ Employees older then " + age + " ------");
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getAge() >= age) {
                employee.print();
            }
        }
    }

    public void increaseEmployeesSalary(int age, double amount) {
        System.out.println("------ Increase employees salary ------");
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getAge() >= age) {
                employee.increaseSalary(amount);
                employee.print();
            }
        }
    }
}
