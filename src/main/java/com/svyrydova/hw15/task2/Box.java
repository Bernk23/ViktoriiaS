package com.svyrydova.hw15.task2;

import lombok.Value;

import java.util.Comparator;

@Value
public class Box implements Comparator<Box> {
    private Integer value;

    @Override
    public int compare(Box o2, Box o1) {
        return 0;
    }
}