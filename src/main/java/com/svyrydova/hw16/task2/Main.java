package com.svyrydova.hw16.task2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        buildDictionaryWithMap("Тестовое сообщение для проверки этого массива, а еще для теста!");
    }

    public static void buildDictionaryWithMap(String test) {
        test = test.toLowerCase();
        test = test.replace("[,.:-?();]", "");
        String[] split = test.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : split) {
            Integer oldCount = map.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            map.put(word, oldCount + 1);
        }
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()));
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
