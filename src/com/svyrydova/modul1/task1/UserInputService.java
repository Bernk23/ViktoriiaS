package com.svyrydova.modul1.task1;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputService {
    static Scanner scanner = new Scanner(System.in);
    static int input = scanner.nextInt();

    public static int getInput() {
        return input;
    }

    public static void service(Array array) {
        int flag;
        do {
            flag = input;
            if (input >= 10) {
                int[] myArray2 = array.array();
                System.out.println(Arrays.toString(myArray2));
                System.out.println("Выберите способ сортировки: 1 - от меньшего к большему, 2 - от большего к меньшему");
                Scanner scan = new Scanner(System.in);
                int change = scan.nextInt();
                switch (change) {
                    case (1):
                        array.bubbleSort2(myArray2);
                        System.out.println(Arrays.toString(myArray2));
                        break;
                    case (2):
                        array.bubbleSort(myArray2);
                        System.out.println(Arrays.toString(myArray2));
                        break;
                }

                for (int i = 2; i < myArray2.length; i += 3) {
                    myArray2[i] = myArray2[i] * myArray2[i] * myArray2[i];
                }
                System.out.println("Массив с кубическим значением каждого третьего значения: " + Arrays.toString(myArray2));
            } else {
                System.out.println("Error!!!");
            }
        } while (flag < 10);

    }
}
