package org.example;

public class Task1 {
    public static void main(String[] args) {
        printMatrixOfStars(6, 6);
    }

    /**
     * Функция выводит в консоль строку из звездочек
     * @param count количество звездочек в строке
     */
    public static void printRowOfStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }

    /**
     * Функция выводит в консоль матрицу из звездочек
     * @param rows количество строк
     * @param columns количество звездочек в строке
     */
    public static void printMatrixOfStars(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            printRowOfStars(columns);
            System.out.println();
        }
    }
}