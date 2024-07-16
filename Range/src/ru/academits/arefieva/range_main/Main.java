package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(3, 7);
        System.out.printf("Диапазон от %f до %f%n", range.getFrom(), range.getTo());
        System.out.println("Длина диапазона = " + range.getLength());
        System.out.println("Заданное число (7) попадает в указанный диапазон - " + range.isInside(7));
        System.out.println();

        range.setFrom(10);
        range.setTo(15);
        System.out.printf("Диапазон от %f до %f%n", range.getFrom(), range.getTo());
        System.out.println("Длина диапазона = " + range.getLength());
        System.out.println("Заданное число (25) попадает в указанный диапазон - " + range.isInside(25));
        System.out.println();

        range.setFrom(0);
        range.setTo(0);
        System.out.printf("Диапазон от %f до %f%n", range.getFrom(), range.getTo());
        System.out.println("Длина диапазона = " + range.getLength());
        System.out.println("Заданное число (5.00) попадает в указанный диапазон - " + range.isInside(5));
        System.out.println();

        range.setFrom(13.56);
        range.setTo(24.89);
        System.out.printf("Диапазон от %f до %f%n", range.getFrom(), range.getTo());
        System.out.println("Длина диапазона = " + range.getLength());
        System.out.printf("Заданное число (15.44) попадает в указанный диапазон - " + range.isInside(15.44));
        System.out.println();
    }
}
