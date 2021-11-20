package com.svyrydova.Hw7.actions;

import com.svyrydova.Hw7.model.Animal;

public class Food {
    public void doAction(Animal animal) {

        if (animal.getHungry() < 50) {
            animal.addHungry(5.0);
            animal.addClear(-2 * 1.5);
        }
        else if (animal.getHappy() < 20) {
            animal.addHungry(5.0);
            animal.addClear(-2 * 1.2);
        }

        else if (animal.isSick()) {
            animal.addHungry(5.0);
            animal.addClear(-2 * 2);
        } else {
            animal.addHungry(5.0);
            animal.addClear(-2);

        }
    }
}
