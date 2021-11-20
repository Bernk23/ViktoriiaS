package com.svyrydova.hw3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        test22();
    }

    private static void test22() {
        final Scanner scanner = new Scanner(System.in);
        final String sNumber = scanner.nextLine();
        System.out.println("Введите число");
        Integer number = Integer.valueOf(sNumber);
        if (number < 0) {
            System.out.println("ERROR!!!");
        } else {
            int sum = 0;
            for (int i = 0; i < sNumber.length(); i++) {
                final int part = number % 10; // 12345 % 10 -> 5
                sum = sum + part;
                number = number / 10; // 12345 / 10 -> 1234
            }
            System.out.println(sum);
        }
    }
}

