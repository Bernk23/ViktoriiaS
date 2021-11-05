package com.svyrydova.hw5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int j;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите целое число больше 3");
            int input = scan.nextInt();
            j = input;
            if (input >= 3) {
                int[] myArray = new int[input];
                Random random = new Random();
                int nums = 0;
                for (int i = 0; i < myArray.length; i++) {
                    myArray[i] = random.nextInt(input);
                    if (myArray[i] % 2 == 0) {
                        nums++;
                    }
                }
                System.out.println(Arrays.toString(myArray));
                int[] myArray2 = new int[nums];
                int index = 0;
                for (int i = 0; i < myArray.length; i++) {
                    if (myArray[i] % 2 == 0) {
                        myArray2[index] = myArray[i];
                        index++;
                    }
                }
                System.out.println(Arrays.toString(myArray2));
            } else {
                System.out.println("Вы ввели неверное число,повторите ввод");
            }

        }
        while (j < 3);
    }
}


