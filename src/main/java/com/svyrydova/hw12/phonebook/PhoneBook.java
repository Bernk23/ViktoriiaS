package com.svyrydova.hw12.phonebook;

import java.util.Optional;

public class PhoneBook {
    public static String phone = "016/161616";
    private static final String[] PHONE_BOOK = new String[]{phone, "016/161617", "016/161618"};

    public static Optional<Integer> getSearch(String phone) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (PHONE_BOOK[i].equals(phone)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
