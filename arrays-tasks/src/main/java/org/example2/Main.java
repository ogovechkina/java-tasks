//        Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
//        Конструктор класса должен заполнять эти поля при создании объекта;
//        Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//        Вывести при помощи методов из пункта 3 ФИО и должность.
//        Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//        Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.

package org.example2;

import static org.example2.Company.*;
public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван Иваньков", "Менеджер", "+7(000)-000-00-04", 80000, 32);
        employees[1] = new Employee("Роман Ромушкин", "Менеджер", "+7(000)-000-00-05", 70000, 42);
        employees[2] = new Employee("Маруся Маруськова", "Аналитик", "+7(000)-000-00-02", 45000, 48);
        employees[3] = new Employee("Степан Степаньков", "Тестировщик", "+7(000)-000-00-03", 28000, 39);
        employees[4] = new Employee("Семен Семушкин", "Разработчик", "+7(000)-000-00-06", 120000, 25);


        Company company = new Company(employees);
        company.printEmployees();
        company.printEmployeesOlderThen(AGE_40);
        company.increaseEmployeesSalary(AGE_45, INCREASE_IN_SALARY);
    }
}

