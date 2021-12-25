package com.svyrydova.hw18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    private static Pattern pattern;
    private static Matcher matcher;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public static void read(String string, String temp, String type, Box box) {
        pattern = Pattern.compile(string);
        matcher = pattern.matcher(temp);
        while (matcher.find()) {
            switch (type) {
                case ("from"):
                    box.setFrom(matcher.group(1));
                    break;
                case ("material"):
                    box.setMaterial(matcher.group(1));
                    break;
                case ("color"):
                    box.setColor(matcher.group(1));
                    break;
                case ("unit"):
                    box.getMaxLiftingCapacity().setUnit(matcher.group(1));
                    break;
                case ("max"):
                    box.getMaxLiftingCapacity().setValue(Integer.parseInt(matcher.group(1)));
                    break;
                case ("name"):
                    box.getCargo().setName(matcher.group(1));
                    break;
                case ("class"):
                    box.getCargo().setClas(matcher.group(1));
                    break;
                case ("delivery"):
                    box.setDeliveryDate(LocalDateTime.parse(matcher.group(1), formatter));
                    break;
            }
        }
    }
}
