package com.svyrydova.hw3.task2;

public class Main {
    public static void main(String[] args) {
        UserInput userInputServ = new UserInput();
        Calculator calculator = new Calculator();
        System.out.println(calculator.getResult(userInputServ));
    }
}