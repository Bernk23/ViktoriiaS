package com.svyrydova.hw2;

import java.util.Random;
public class Main {
    public static void main(String[] args) {

        double a = 3.0;
        double b = 2.0;
        double c = 4.0;
        double p = (a + b + c) / 2.0;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(S);

        double d = Math.random();
        double e = Math.random();
        double h = Math.random();
        double min = (Math.abs(d) < Math.abs(e) && Math.abs(d) < Math.abs(h)) ? d : (Math.abs(e) < Math.abs(d) && Math.abs(e) < Math.abs(h)) ? e : h;
        System.out.println (min);

        Random g = new Random();
        int g1 = g.nextInt();
        int g2 = g1 %2;
        if (g2==0) {
            System.out.println("Четное");
        }
        else {
            System.out.println("Нечетное");
        }
    }
}

