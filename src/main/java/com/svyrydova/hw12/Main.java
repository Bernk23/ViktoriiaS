package com.svyrydova.hw12;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Task1 exception = new Task1();
            exception.error();
        } catch
        (IllegalArgumentException e) {
            System.out.println("Error = " + e.getMessage());
        } finally {
            System.out.println("ERROR!!!!");
        }
        try {
            UserExceptionMethod userExceptionMethod = new UserExceptionMethod();
            userExceptionMethod.userExceptionMethod();
        } catch (UserArgumentException | UserIllegalException | UserInputException e) {
            System.out.println("Error = " + e.getMessage());
        }
        try {
            Task2.f();
        } catch (IllegalArgumentException e) {
            throw new IOException();
        }
    }
}