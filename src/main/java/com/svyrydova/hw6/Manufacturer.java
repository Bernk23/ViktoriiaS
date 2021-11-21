package com.svyrydova.hw6;

public enum Manufacturer {
    BMW("БМВ"), Ford("Форд");

    private String russianName;

    Manufacturer(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
