package com.svyrydova.Modul1.Task1;

import java.util.Random;


public class Array {

    int[] array = new int[UserInputService.getInput()];

    public int[] array() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(100) - 100);
        }
        return array;

    }
    public void bubbleSort(int[] num) {
        int j;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    public void bubbleSort2(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}



