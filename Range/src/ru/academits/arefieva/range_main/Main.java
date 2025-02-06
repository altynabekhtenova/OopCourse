package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(-10, 19);

        double[] startPoint = {-4, 5, 6, -9, 9, 10};
        double[] endPoint = {10, 11, 12, 13, 20, 22};

        Range range2 = new Range(startPoint[0], endPoint[0]);

        for (double secondRangeFrom : startPoint) {
            for (double secondRangeTo : endPoint) {
                range2.setFrom(secondRangeFrom);
                range2.setTo(secondRangeTo);

                System.out.printf("Результат пересечения диапазонов (%.1f; %.1f) и (%.1f; %.1f) = %s%n",
                        range1.getFrom(), range1.getTo(), secondRangeFrom, secondRangeTo,
                        range1.getIntersection(range2));
                System.out.printf("Результат объединения диапазонов (%.1f; %.1f) и (%.1f; %.1f) = %s%n",
                        range1.getFrom(), range1.getTo(), secondRangeFrom, secondRangeTo,
                        Arrays.toString(range1.getUnion(range2)));
                System.out.printf("Результат разности диапазонов (%.1f; %.1f) и (%.1f; %.1f) = %s%n%n",
                        range1.getFrom(), range1.getTo(), secondRangeFrom, secondRangeTo,
                        Arrays.toString(range1.getDifference(range2)));
            }
        }
    }
}
