package com.svyrydova.hw15.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    final private MyList<Integer> myList = new MyList<>();

    @Test
    public void add() {
        myList.add(12);
        myList.add(12);
        myList.add(24);
        myList.add(28);
        int actual = myList.getSize();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void getLastFromLast() {
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(61);
        int actual = myList.getFromLast(61);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstFromLast() {
        myList.add(8);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        int actual = myList.getFromLast(8);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void getNullFromLast() {
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        Integer actual = myList.getFromLast(76);
        Integer expected = null;
        assertEquals(expected, actual);
    }
}