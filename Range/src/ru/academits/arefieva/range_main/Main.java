package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(7, 9);
        Range range2 = new Range(6, 22);
        System.out.println("Интервал пересечения двух интервалов = " + Arrays.toString(range1.getIntersection(range2)));

        Range range3 = new Range(1, 9);
        Range range4 = new Range(11, 22);
        System.out.println("Интервал объединения двух интервалов = " + Arrays.toString(range3.getJoin(range4)));

        Range range5 = new Range(1, 6);
        Range range6 = new Range(9, 17);
        System.out.println("Интервал объединения двух интервалов = " + Arrays.toString(range5.getDifference(range6)));
    }
}
