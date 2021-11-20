package com.svyrydova.Hw7;

import com.svyrydova.Hw7.model.Animal;
import com.svyrydova.Hw7.service.UserInputService;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        final Animal animal = userInputService.userInputAnimalTypeName();
        userInputService.doActions(animal);
    }
}
