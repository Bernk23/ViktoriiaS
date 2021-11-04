package com.svyrydova.hw5;

import java.util.Random;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] myArray = new int[8];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10)+1;

        }
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            if(i % 2 == 1) {
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}