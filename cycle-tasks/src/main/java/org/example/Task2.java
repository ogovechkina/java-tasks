package org.example;

public class Task2 {
    public static void main(String[] args) {
        printMatrix(6, 6);
    }

    public static void printRowOfStarsAndZeros(int count) {
        System.out.print("0 ");
        for (int i = 0; i < count - 2; i++) {
            System.out.print("* ");
        }
        System.out.print("0 ");
    }

    public static void printRowOfZeros(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("0 ");
        }
    }

    /**
     * Выводит в консоль матрицу размером rows на columns из звездочек обрамленную нулями
     * Минимальный допустимый размер матрицы 3х3
     * @param rows количество строк
     * @param columns количество звездочек в строке
     */
    public static void printMatrix(int rows, int columns) {
        if (rows < 3 || columns < 3) {
            System.out.println("Минимальный допустимый размер матрицы 3х3!");
            return;
        }

        printRowOfZeros(columns);
        System.out.println();

        for (int i = 0; i < rows - 2; i++) {
            printRowOfStarsAndZeros(columns);
            System.out.println();
        }
        printRowOfZeros(columns);
    }
}
