//        Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
//        Конструктор класса должен заполнять эти поля при создании объекта;
//        Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//        Вывести при помощи методов из пункта 3 ФИО и должность.
//        Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//        Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.

package org.example2;

public class Main {

    public static final int AGE_40 = 40;
    public static final int AGE_45 = 45;
    public static final double INCREASE_IN_SALARY = 5000;

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван Иваньков", "Менеджер", "+7(000)-000-00-04", 80000, 32);
        employees[1] = new Employee("Роман Ромушкин", "Менеджер", "+7(000)-000-00-05", 70000, 42);
        employees[2] = new Employee("Маруся Маруськова", "Аналитик", "+7(000)-000-00-02", 45000, 48);
        employees[3] = new Employee("Степан Степаньков", "Тестировщик", "+7(000)-000-00-03", 28000, 39);
        employees[4] = new Employee("Семен Семушкин", "Разработчик", "+7(000)-000-00-06", 120000, 25);

        printEmployees(employees);
        printEmployeesOlderThen(employees, AGE_40);
        increaseEmployeesSalary(employees, AGE_45, INCREASE_IN_SALARY);
    }

    public static void printEmployees(Employee[] employees) {
        System.out.println("------ Employees ------");
        for (int i = 0; i < employees.length; i++) {
            employees[i].print();
        }
    }

    public static void printEmployeesOlderThen(Employee[] employees, int age) {
        System.out.println("------ Employees older then " + age + " ------");
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getAge() >= age) {
                employee.print();
            }
        }
    }

    public static void increaseEmployeesSalary(Employee[] employees, int age, double amount) {
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

