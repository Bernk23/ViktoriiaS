package com.svyrydova.hw15.task3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MainTest {

    final private List<String> testPeople = new ArrayList<String>();

    @Test
    public void addAnimal() {
        List<String> testPeople = new ArrayList<>();
        Map<Integer, String> testMap = new HashMap<>();
        testPeople.add("Alex");
        testMap.put(4, "Alex");
        Map<Integer, String> actual = Main.getPeople(testPeople);
        assertEquals(testMap, actual);
    }
}