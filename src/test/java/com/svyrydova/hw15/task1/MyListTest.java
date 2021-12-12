package com.svyrydova.hw15.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    MyList<Integer> myList = new MyList<>();

    @Test
    public void add() {
        myList.add(10);
        myList.add(24);
        myList.add(34);
        myList.add(44);
        String actual = myList.toString();
        String expected = "MyList{head=MyNode{value=10}, tail=MyNode{value=44}}";
        assertEquals(expected, actual);
    }

    @Test
    public void getFromLast() {
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        int actual = myList.getFromLast(24);
        int expected = 2;
        assertEquals(expected, actual);
    }
}