package com.svyrydova.hw3.task2;

import java.util.Scanner;

public class UserInput {
    private Scanner scan = new Scanner(System.in);
    private char symbol;
    double num1;
    double num2;

    public char addSymbol() {
        symbol = scan.next().charAt(0);
        return symbol;
    }

    public double addNum1() {
        num1 = scan.nextDouble();
        return num1;
    }

    public double addNum2() {
        num2 = scan.nextDouble();
        return num2;
    }
}
