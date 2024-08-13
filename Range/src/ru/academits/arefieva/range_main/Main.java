package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(1, 3);
        Range range2 = new Range(6, 10);
        System.out.println("Результат пересечения двух интервалов = " + range1.getIntersection(range2));
        System.out.println("Результат объединения двух интервалов = " + Arrays.toString(range1.getUnion(range2)));
        System.out.println("Результат разности двух интервалов = " + Arrays.toString(range1.getDifference(range2)));
        System.out.println();

        Range range3 = new Range(6, 10);
        Range range4 = new Range(1, 3);
        System.out.println("Результат пересечения двух интервалов = " + range3.getIntersection(range4));
        System.out.println("Результат объединения двух интервалов = " + Arrays.toString(range3.getUnion(range4)));
        System.out.println("Результат разности двух интервалов = " + Arrays.toString(range3.getDifference(range4)));
        System.out.println();

        Range range5 = new Range(1, 16);
        Range range6 = new Range(9, 13);
        System.out.println("Результат пересечения двух интервалов = " + range5.getIntersection(range6));
        System.out.println("Результат объединения двух интервалов = " + Arrays.toString(range5.getUnion(range6)));
        System.out.println("Результат разности двух интервалов = " + Arrays.toString(range5.getDifference(range6)));
        System.out.println();

        Range range7 = new Range(9, 13);
        Range range8 = new Range(1, 16);
        System.out.println("Результат пересечения двух интервалов = " + range7.getIntersection(range8));
        System.out.println("Результат объединения двух интервалов = " + Arrays.toString(range7.getUnion(range8)));
        System.out.println("Результат разности двух интервалов = " + Arrays.toString(range7.getDifference(range8)));
        System.out.println();

        Range range9 = new Range(1, 9);
        Range range10 = new Range(6, 15);
        System.out.println("Результат пересечения двух интервалов = " + range9.getIntersection(range10));
        System.out.println("Результат объединения двух интервалов = " + Arrays.toString(range9.getUnion(range10)));
        System.out.println("Результат разности двух интервалов = " + Arrays.toString(range9.getDifference(range10)));
        System.out.println();

        Range range11 = new Range(6, 15);
        Range range12 = new Range(1, 9);
        System.out.println("Результат пересечения двух интервалов = " + range11.getIntersection(range12));
        System.out.println("Результат объединения двух интервалов = " + Arrays.toString(range11.getUnion(range12)));
        System.out.println("Результат разности двух интервалов = " + Arrays.toString(range11.getDifference(range12)));
        System.out.println();

        Range range13 = new Range(1, 6);
        Range range14 = new Range(6, 9);
        System.out.println("Результат пересечения двух интервалов = " + range13.getIntersection(range14));
        System.out.println("Результат объединения двух интервалов = " + Arrays.toString(range13.getUnion(range14)));
        System.out.println("Результат разности двух интервалов = " + Arrays.toString(range13.getDifference(range14)));
        System.out.println();
    }
}
