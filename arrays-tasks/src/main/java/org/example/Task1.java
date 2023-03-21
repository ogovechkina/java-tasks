package org.example;

public class Task1 {

    public static void main(String[] args) {
        int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxNum = num.length;

        for (int i = 0; i < maxNum; i++) {
            if (num[i] < 6) num[i] = num[i] * 2;

            System.out.print(i + 1 + "-" + num[i] + " ");
        }
    }
}