package com.svyrydova.hw6;

public class Garage {
    public static void checkСar (Car car){
        if (car.isEnoughPetrolLevel()) {
            System.out.println("Состояние бензина хорошее");
        } else {
            System.out.println("Проверку бензина машина не прошла, потому,что бензина меньше 50");
        }
        if (car.getPowerType().getPower() > 200) {
            System.out.println("Мощность дигателя достаточная");
        } else {
            System.out.println("Проверку двигателя машина не прошла, потому, что уровень заряда меньше 200");
        }

    }

}
