package com.svyrydova.hw2;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        abcpS();

        dehmin();

        random();

        decbin();

    }

    public static void abcpS() {
        double a = 3.0;
        double b = 2.0;
        double c = 4.0;
        double p = (a + b + c) / 2.0;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(S);
    }


    public static void dehmin() {

        double d = Math.random();
        double e = Math.random();
        double h = Math.random();
        double min = (Math.abs(d) < Math.abs(e) && Math.abs(d) < Math.abs(h)) ? d : (Math.abs(e) < Math.abs(d) && Math.abs(e) < Math.abs(h)) ? e : h;
        System.out.println(min);

    }

    public static void random() {
        Random g = new Random();
        int g1 = g.nextInt();
        int g2 = g1 % 2;
        if (g2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }


    public static void decbin() {
        System.out.println("Введите Число"); // нужно чтобы увидеть куда вводить
        Scanner scanner = new Scanner(System.in); // создает новый ввод данных в консоль
        int num = scanner.nextInt(); // создает переменную куда этот ввод помещается то есть число инт
        int bin; // создали переменную в которую помещается остаток от деления (1 или 0)
        String str = ""; //Создали пустую строку для разещения в ней цифр из цикла
        while (num > 0) { // начали цикл до тех пор пока число больше 0 он будет работать
            bin = num % 2; // переменная бин в нее помещается отсаток от деления (1 или о)
            num /= 2; // остаток от деления (целый) например 8/2 = 4, 4/2 = 2 и тд.
            str += bin; // помещаем во внешнюю часть str все результаті с цикла, как будто пишем в строку в блакнот
        }
        StringBuilder rev = new StringBuilder(str); // работает в свяязке с реверсом (команды для раззврота строки) и формирует строку
        rev.reverse(); // переворачивает строку в обратную сторону rev. єто название переменной из предідущей коанды
        System.out.println(rev); // вывод на экран
    }
}

