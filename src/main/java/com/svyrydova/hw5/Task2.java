package com.svyrydova.hw5;

import java.util.Random;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] myArray = new int[4];
        Random random = new Random();
        int upperBound = 99;
        int lowerBound = 10;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
        }
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            if (i > 0) {
                if (myArray[i - 1] >= myArray[i]) {
                    System.out.println("Массив не является строго возрастающей последовательностью");
                }
            }
        }
    }
}
