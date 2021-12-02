package com.svyrydova.hw12;

import java.util.Random;

public class UserExceptionMethod {

    private Random random = new Random();
    private int temp = random.nextInt();

    public void userExceptionMethod() throws UserArgumentException, UserIllegalException, UserInputException {
        int temp = 21;
        if (temp < 21) {
            throw new UserArgumentException("Error a");
        } else if (temp == 21) {
            throw new UserIllegalException("Error b");
        } else {
            throw new UserInputException("Error c");
        }
    }
}