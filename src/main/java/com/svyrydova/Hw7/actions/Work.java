package com.svyrydova.Hw7.actions;
import java.util.Random;
import com.svyrydova.Hw7.model.Animal;

public class Work {
    private final Random random = new Random();
    private int workCount;

    public void doAction(Animal animal) {
        if (animal.getAge() < 5 || animal.getHappy() < 20) {
            System.out.println("Error!");
            return;
        }

        if (animal.getHungry() < 50) {
            animal.addMoney(random.nextInt(20-5)+5);
            animal.addHungry(-4 * 1.5);
            animal.addHappy(-4 * 1.5);
        } else if (animal.isSick()) {
            animal.addMoney(random.nextInt(20-5)+5);
            animal.addHungry(-4 * 2);
            animal.addHappy(-4 * 2);
        }
        else {
            animal.addMoney(random.nextInt(20-5)+5);
            animal.addHungry(-4);
            animal.addHappy(-4);

        }


        if (++workCount == 6) {
            workCount = 0;
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