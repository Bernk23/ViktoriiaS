package com.svyrydova.hw15.task3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    final private List<String> testPeople = new ArrayList<String>();

    @Test
    public void getSize() {
        testPeople.add("Nika");
        int actual = Main.getSize(testPeople, 0);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void getPeople() {
        testPeople.add("Nika");
        String actual = Main.getPeople(testPeople).toString();
        String expected = "{4=Nika}";
        assertEquals(expected, actual);
    }
}