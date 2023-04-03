//1 - Создать 2 класса: мужчины и женщины, которые наследуются от класса Человек. Должны быть заданы поля: имя и возраст
//2 - Необходимо вывести в консоль, кто подходит для участия в забеге. (** Можно сохранить в файл)
//Условия:
//Для забега подходят мужчины старше 20 и женщины старше 25. Необходимо все имена привести к UpperCase.
//Список участников должен выводиться в алфавитном порядке.
//Сохранить список участников в новый List и вывести в консоль имена всех участников забега.

package org.example;

import org.example.human.Human;
import org.example.human.Man;
import org.example.human.Woman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Human> runners = new ArrayList<>(Arrays.asList(
                new Woman("София", 24),
                new Woman("Агафья", 25),
                new Woman("Параскева", 32),
                new Woman("Степанида", 18),
                new Man("Боромир", 19),
                new Man("Серафим", 25),
                new Man("Аркадий", 34),
                new Man("Ануфрий", 18)
        ));

        System.out.println("Для забега подходят: ");
        List<String> list = runners.stream()
                .filter(p -> p.getClass().getSimpleName().equals("Man") && p.getAge() >= 20
                        || p.getClass().getSimpleName().equals("Woman") && p.getAge() >= 25)
                .map(p -> p.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}