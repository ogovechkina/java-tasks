//  Напишите интерфейc, который будет конвертировать градусы по Цельсию в Кельвины, Фаренгейты.
//  У интерфейса должен быть метод, который будет делать конвертацию.
//  Метод для конвертации должен иметь перегрузку метода

package org.example;

public class Main {

    public static void main(String[] args) {
        CelsiusConverter celsiusToKelvin = new CelsiusToKelvinConverter();
        CelsiusConverter celsiusToFahrenheit = new CelsiusToFahrenheitConverter();

        System.out.println("Результат конфертации Цельсию в Кельвины - " + celsiusToKelvin.convert(30));
        System.out.println("-----------------------");
        System.out.println("Результат конфертации Цельсию в Фаренгейты - " + celsiusToFahrenheit.convert(30));
        System.out.println("-----------------------");
        System.out.println("Результат конфертации Цельсию в Кельвины - " + celsiusToKelvin.convert(55.5));
        System.out.println("-----------------------");
        System.out.println("Результат конфертации Цельсию в Фаренгейты - " + celsiusToFahrenheit.convert(55.5));
    }

}