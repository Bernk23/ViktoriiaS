package com.svyrydova.hw3;

public class Task1 {
    public static void main(String[] args) {

        int hapNum = 0;
        for (int x = 0; x <= 999; x++) {
            int num1 = x % 10;
            int num2 = (x / 10) % 10;
            int num3 = (x / 100) % 10;
            int sum1 = (num1 + num2 + num3);

            for (int y = 0; y <= 999; y++) {
                int num4 = y % 10;
                int num5 = (y / 10) % 10;
                int num6 = (y / 100) % 10;

                int sum2 = (num4 + num5 + num6);
               if (sum1==sum2) {
                    hapNum++;
                }
            }

        }
        System.out.println("Количество счастливых чисел: " + hapNum);
    }
}
