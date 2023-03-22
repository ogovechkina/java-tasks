package org.example;

public class Task2 {

    public static void main(String[] args) {
        int[][] square = new int[10][10];
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
            square[i][square.length - i - 1] = 1;
        }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
