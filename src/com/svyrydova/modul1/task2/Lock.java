package com.svyrydova.modul1.task2;

public class Lock {
    private int[] array;

    public int[] getArray() {
        return array == null ? null : array.clone();
    }

    public Lock(int[] array) {
        this.array = array.clone();
    }
}
