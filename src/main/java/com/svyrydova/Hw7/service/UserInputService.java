package com.svyrydova.Hw7.service;

import java.util.Scanner;

import com.svyrydova.Hw7.actions.*;
import com.svyrydova.Hw7.model.Animal;
import com.svyrydova.Hw7.model.AnimalType;

public class UserInputService {
    private final Scanner scanner = new Scanner(System.in);
    private final Food food = new Food();
    private final Work work = new Work();
    private final Play play = new Play();
    private final Health health = new Health();
    private final Store store = new Store();

    public Animal userInputAnimalTypeName() {

        System.out.println("Доступные типы персонажа");
        AnimalType[] values = AnimalType.values();
        StringBuilder animalTypeString = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            animalTypeString.append(i).append(") ")
                    .append(values[i]).append("\n");
        }
        System.out.println(animalTypeString);
        int userInputAnimalType;
        System.out.println("Введите номер животного");
        do {
            userInputAnimalType = scanner.nextInt();
        }
        while (userInputAnimalType < 0 || userInputAnimalType >= values.length);

        String userInputAnimalName;
        do {
            System.out.println("Введите имя животного от 3 до 20 символов");
            userInputAnimalName = scanner.next();
        } while (userInputAnimalName.length() < 3 || userInputAnimalName.length() > 20);
        return new Animal(userInputAnimalName, values[userInputAnimalType]);


    }

    public void doActions(Animal animal) {
        StringBuilder builder = new StringBuilder("Выберите действие:\n");
        builder.append(0).append(") Выйти\n");
        builder.append(1).append(") Кормить\n");
        builder.append(2).append(") Работать\n");
        builder.append(3).append(") Играть\n");
        builder.append(4).append(") Лечить\n");
        builder.append(5).append(") Магазин\n");


        int userAction;
        do {


            System.out.println(animal);
            System.out.println(builder);
            userAction = scanner.nextInt();

            switch (userAction) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    food.doAction(animal);
                    break;
                }
                case 2: {
                    work.doAction(animal);
                    break;
                }
                case 3: {
                    play.doAction(animal);
                    break;
                }
                case 4: {
                    health.doAction(animal);
                    break;
                }
                case 5: {
                    store.doAction(animal);
                    break;
                }
                default:
                    throw new IllegalStateException();

            }
        } while (userAction != 0);


    }
}



