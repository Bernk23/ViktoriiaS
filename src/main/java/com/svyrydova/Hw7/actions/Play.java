package com.svyrydova.Hw7.actions;
import java.util.Random;
import com.svyrydova.Hw7.model.Animal;

public class Play {
    private final Random random = new Random();
    private int playCount;

    public void doAction(Animal animal) {

        if (animal.getHungry() < 50) {
            animal.addHungry(-3.0 * 1.5);
            animal.addHappy(6);
            animal.addMoney(random.nextInt(10) + 1);
        } else if (animal.getHappy() < 20) {
            animal.addHungry(-3.0 * 1.2);
            animal.addHappy(6);
            animal.addMoney(random.nextInt(10) + 1);
        } else if (animal.isSick()) {
            animal.addHungry(-3 * 2);
            animal.addHappy(6);
            animal.addMoney(random.nextInt(10) + 1);
        } else {
            animal.addHungry(-3.0);
            animal.addHappy(6);
            animal.addMoney(random.nextInt(10) + 1);

        }

        if (++playCount == 5) {
            playCount = 0;
            animal.addAge(1);
        }
        final int randomNumber = random.nextInt(100);
        if (animal.getClear() < 50) {
            if (randomNumber <= 30) {
                animal.setSick(true);
            }
        } else {
           if (randomNumber <= 10) {
                animal.setSick(true);
            }
        }
    }
}