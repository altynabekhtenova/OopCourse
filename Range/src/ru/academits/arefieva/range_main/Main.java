package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(-10, 19);

        double[] startPoints = {-4, 5, 6, -9, 9, 10};
        double[] endPoints = {10, 11, 12, 13, 20, 22};

        Range range2 = new Range(startPoints[0], endPoints[0]);

        for (double secondRangeFrom : startPoints) {
            for (double secondRangeTo : endPoints) {
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
