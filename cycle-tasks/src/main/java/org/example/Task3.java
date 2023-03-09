package org.example;

public class Task3 {
    public static void main(String[] args) {
        printMatrix(6);
    }

    public static void printSymbols(int n, String symbol) {
        for (int i = 0; i < n; i++) {
            System.out.print(symbol);
        }
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            printSymbols(i, "0 ");
            System.out.print("  ");
            printSymbols(n - i - 1, "* ");
            System.out.println();
        }
    }
}
