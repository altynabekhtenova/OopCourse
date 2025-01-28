package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(-1.5, 3.7);
        range.setTo(6.8);
        System.out.printf("Длина диапазона %s = %.1f%n", range, range.getLength());

        double number = 4.5;
        System.out.printf("Принадлежность числа %.1f к диапазону %s - %b", number, range, range.isInside(number));
    }
}
