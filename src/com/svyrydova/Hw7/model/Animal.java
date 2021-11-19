package com.svyrydova.Hw7.model;

import java.util.Arrays;
import java.util.Random;

public class Animal {
    private final String name;
    private final AnimalType type;
    private int age;
    private double hungry;
    private int money;
    private double clear;
    private double happy;
    private boolean sick;
    private String[] present;


    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public void setHungry(double hungry) {
        this.hungry = hungry;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setClear(double clear) {
        this.clear = clear;
    }

    public void setHappy(double happy) {
        this.happy = happy;
    }

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.hungry = 100;
        this.money = 10000;
        this.clear = 100;
        this.happy = 50;
        this.sick = false;
        this.present = new String[10];
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ", hungry=" + hungry +
                ", money=" + money +
                ", clear=" + clear +
                ", happy=" + happy +
                ", sick=" + sick +
                ", presents=" + Arrays.toString(present) +
                '}';
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public double getHungry() {
        return hungry;
    }

    public int getMoney() {
        return money;
    }

    public double getClear() {
        return clear;
    }

    public double getHappy() {
        return happy;
    }

    public void addAge(int age) {
        this.age += age;
    }

    public void addHungry(double hungry) {
        this.hungry += hungry;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public void addClear(double clear) {
        this.clear += clear;
    }

    public void addHappy(double happy) {
        this.happy += happy;
    }


    public void presents() {
        Random random = new Random();
        String gift = "Gift " + String.valueOf(random.nextInt(900));
        if (present[present.length - 1] != null) {
            String[] newPresent = new String[present.length + (present.length / 2)];
            newPresent = Arrays.copyOf(present, present.length);
            this.present = newPresent;
        } else {
            for (int i = 0; i < present.length; i++) {
                String temp = present[i];
                if (temp == null) {
                    present[i] = gift;
                    break;
                }
            }
        }
    }
}
