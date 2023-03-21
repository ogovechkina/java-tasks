package org.example;

public class Task3 {

    public static void main(String[] args) {
        int[] linear = {42, 98, 2, 54};
        int max = linear[0];
        int min = linear[0];
        for (int i = 0; i < linear.length; i++) {
            if (linear[i] > max) {
                max = linear[i];
            }
            if (linear[i] < min) {
                min = linear[i];
            }
        }
        System.out.println("Минимальный элемент " + min);
        System.out.println("Максимальный элемент " + max);
    }
}