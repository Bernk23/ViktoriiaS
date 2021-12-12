package com.svyrydova.hw15.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    final static List<String> people = new ArrayList<String>();

    public static void main(String[] args) {
        people.add("Vasia");
        people.add("Valera");
        people.add("Nika");
        people.add("Alexandr");
        people.add("Tom");
        System.out.println(getPeople(people));
    }

    public static int getSize(List<String> newPeople, int i) {
        int key = newPeople.get(i).length();
        return key;
    }

    public static Map getPeople(List<String> newPeople) {
        Map<Integer, String> hashAnimal = new HashMap<>();
        for (int i = 0; i < newPeople.size(); i++) {
            int key = getSize(newPeople, i);
            hashAnimal.put(key, String.valueOf(newPeople.get(i)));
        }
        return hashAnimal;
    }
}