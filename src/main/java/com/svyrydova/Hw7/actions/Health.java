package com.svyrydova.Hw7.actions;

import com.svyrydova.Hw7.model.Animal;

public class Health {
    public void doAction(Animal animal) {
        if (animal.getMoney() < 50) {
            System.out.println("У вас недостаточно денег");
        } else {
            animal.setHappy(10);
            animal.setHungry(70);
            animal.setClear(80);
            animal.addMoney(-50);
            animal.setSick(false);
        }
    }
}
