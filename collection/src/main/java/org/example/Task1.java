//        Создайте метод, который на вход принимает коллекцию объектов с дубликатами.
//        Метод должен возвращать коллекцию без дубликатов.


package org.example;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // коллекция объектов с дубликатами
        List<String> listWithDuplicates = new ArrayList<>(Arrays.asList("C++", "Java", "C++"));
        listWithDuplicates.add("Kotlin");
        listWithDuplicates.add("Kotlin");
        listWithDuplicates.add("Python");

        for (String element : listWithDuplicates) {
            System.out.println(element);
        }

        System.out.println("Java contains: " + listWithDuplicates.contains("Java"));
        System.out.println("Python contains: " + listWithDuplicates.contains("Python"));

        listWithDuplicates.remove("Java");
        System.out.println("Java contains: " + listWithDuplicates.contains("Java"));
        listWithDuplicates.add("Java");


        Set<String> uniqueSet = distinct(listWithDuplicates);
        for (String element : uniqueSet) {
            System.out.println(element);
        }
    }
    public static Set<String> distinct(List<String> listWithDuplicates) {
        return new HashSet<>(listWithDuplicates);
    }
}