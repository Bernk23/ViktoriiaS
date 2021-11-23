package com.svyrydova.hw3.task2;

public class Calculator {
    private double result;

    public double getResult(UserInput userInput) {
        char temp;
        do {
            System.out.println("Введите символ");
            char symbol = userInput.addSymbol();
            temp = symbol;
            if (symbol != '0') {
                System.out.println("Введите первое число");
                double number1 = userInput.addNum1();
                System.out.println("Введите первое число");
                double number2 = userInput.addNum2();
                switch (symbol) {
                    case ('+'):
                        result = (number1 + number2);
                        break;
                    case ('*'):
                        result = (number1 * number2);
                        break;
                    case ('/'):
                        if (number2 != 0) {
                            result = (number1 / number2);
                        } else {
                            result = -3.0d;
                        }
                        break;
                    case ('-'):
                        result = (number1 - number2);
                        break;
                    default:
                        result = -2.0d;
                }
            } else {
                result = -5.0d;
            }
            return result;
        } while (temp == '0');
    }
}
