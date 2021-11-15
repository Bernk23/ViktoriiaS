package com.svyrydova.Modul1.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        int[] zzz = new int[]{1,2,3,4,5,6,7,8,9,0};
        Lock lock = new Lock(array);

        System.out.println(Arrays.toString(lock.getArray()));
        for (int i = 2; i < lock.getArray().length; i += 3) {
            lock.getArray()[i] = (int) Math.pow(lock.getArray()[i], 3);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = zzz[i];
        }
        System.out.println(Arrays.toString(lock.getArray()));
    }
}
