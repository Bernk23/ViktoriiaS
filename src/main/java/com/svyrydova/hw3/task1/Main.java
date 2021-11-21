package com.svyrydova.hw3.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Sum sum = new Sum();
        System.out.println(sum.getSum(userInput));
    }
}
