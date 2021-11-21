package com.svyrydova.hw3.task1;

public class Sum {

        public int getSum (UserInput userInput) {
            int number1 = userInput.getNumber();
            int sum = 0;
        if (number1 < 0) {
            return -7;
        } else {
            while (number1 > 0) {
                final int part = number1 % 10;
                sum = sum + part;
                number1 = number1 / 10;
            }
        }
       return sum;
    }
}