package com.svyrydova.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        int[] myArray2 = new int[4];
        Random random = new Random();

        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < myArray2.length; i++) {
            myArray[i] = random.nextInt(5);
            sum = sum + myArray[i];
            myArray2[i] = random.nextInt(5);
            sum2 = sum2 + myArray2[i];
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));

        double ave =sum / myArray.length;
        double ave2 =sum2 / myArray.length;
        System.out.println(ave);
        System.out.println(ave2);

        if (ave < ave2) {
            System.out.println("Среднее арифметическое первого массива меньше среднего арифметического второго массива");
        } else if (ave > ave2) {
            System.out.println("Среднее арифметическое первого массива больше среднего арифметического второго массива");
        } else {
            System.out.println("Среднее арифметическое первого массива равно среднему арифметическому второго массива");
        }
    }
}





