//Создайте метод, который прибавляет 1'000'000 элементов в коллекции ArrayList и LinkedList.
// Напишите другой метод, который будет выбирать из созданного первым методом списка элемент наугад 100'000 раз.
//** Попробуйте замерить время, потраченное на работу второго метода. Подумайте, почему результаты отличаются.

package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
    private static final int NUMBER_OF_ELEMENTS = 1_000_000;
    private static final int RANDOM_ELEMENT_NUMBER = 100_000;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        initList(arrayList);
        initList(linkedList);

        takeRandomListElements(arrayList);
        takeRandomListElements(linkedList);
    }

    private static void initList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            list.add(RANDOM.nextInt(NUMBER_OF_ELEMENTS));
        }
        System.out.println(list.getClass().getSimpleName()
                + " init time, ms: " + (System.currentTimeMillis() - startTime));
    }

    private static void takeRandomListElements(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < RANDOM_ELEMENT_NUMBER; i++) {
            list.get(RANDOM.nextInt(list.size()));
        }
        System.out.println(list.getClass().getSimpleName()
                + " take time, ms: " + (System.currentTimeMillis() - startTime));
    }
}
