// Время имеет формат часы:минуты. И часы, и минуты состоят из двух цифр, пример: 09:00.
// Напишите RegEx выражение для поиска времени в строке: «Завтрак в 09:00». Учтите, что «37:98» — некорректное время.

package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExStringTime {
    public static final Pattern TIME_PATTERN = Pattern.compile("(?:[0-1][0-9]|2[0-3]):[0-5][0-9]");

    public static void main(String[] args) {

        findTimeInText("Начало дня в 00:00");
        findTimeInText("Завтрак в 09:00");
        findTimeInText("Обед в 14:30");
        findTimeInText("Ужин в 19:00");
        findTimeInText("Конец дня в 23:59");
        findTimeInText("Неправильное время 23:60");
        findTimeInText("Неправильное время 37:98");
    }

    private static void findTimeInText(String text) {
        Matcher matcher = TIME_PATTERN.matcher(text);
        if (matcher.find()) {
            System.out.println("Найдено время: " + matcher.group());
        } else {
            System.out.println("Время не найдено!");
        }
    }
}