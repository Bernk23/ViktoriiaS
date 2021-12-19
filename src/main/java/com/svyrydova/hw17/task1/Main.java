package com.svyrydova.hw17.task1;

import java.util.stream.Stream;

public class Main {
    public class Task1 {
        public static void main(String[] args) {
            Stream.of("Raccoon", "Cat", "Dog", "Puppy", "Monkey")
                    .sorted()
                    .forEach(System.out::println);
        }
    }
}
