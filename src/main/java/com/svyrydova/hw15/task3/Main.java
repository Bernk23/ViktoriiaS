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

    public static Map<Integer, String> getPeople(List<String> newPeople) {
        Map<Integer, String> hashPeople = new HashMap<>();
        for (String people : newPeople) {
            hashPeople.put(people.length(), people);
        }
        return hashPeople;
    }
}