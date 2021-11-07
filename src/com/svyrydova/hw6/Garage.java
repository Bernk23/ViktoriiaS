package com.svyrydova.hw6;

public class Garage {
    public static void checkСar (Class Car){

        if (car.isEnoughPetrolLevel()) {
            System.out.println("Условия успешно пройдены");
        } else {
            System.out.println("Проверка не пройдена");
        }

    }

}
