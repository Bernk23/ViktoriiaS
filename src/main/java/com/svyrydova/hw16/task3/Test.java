package com.svyrydova.hw16.task3;

public class Test {
    public static void main(String[] args) {

        Integer[] test1 = new Integer[]{10, 15, 20};
        ArrayIterator<Integer> test = new ArrayIterator<>(test1);
        while (test.hasNext()) {
            System.out.println(test.next());
        }
    }
}
