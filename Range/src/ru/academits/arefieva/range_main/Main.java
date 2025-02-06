package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(-10, 19);

        double[] secondRangeFrom = {-4, 5, 6, -9, 9, 10};
        double[] secondRangeTo = {10, 11, 12, 13, 20, 22};

        Range range2 = new Range(secondRangeFrom[0], secondRangeTo[0]);

        for (double from : secondRangeFrom) {
            for (double to : secondRangeTo) {
                range2.setFrom(from);
                range2.setTo(to);

                System.out.printf("Результат пересечения диапазонов (%.1f; %.1f) и (%.1f; %.1f) = %s%n",
                        range1.getFrom(), range1.getTo(), from, to, range1.getIntersection(range2));
                System.out.printf("Результат объединения диапазонов (%.1f; %.1f) и (%.1f; %.1f) = %s%n",
                        range1.getFrom(), range1.getTo(), from, to, Arrays.toString(range1.getUnion(range2)));
                System.out.printf("Результат разности диапазонов (%.1f; %.1f) и (%.1f; %.1f) = %s%n%n",
                        range1.getFrom(), range1.getTo(), from, to, Arrays.toString(range1.getDifference(range2)));
            }
        }
    }
}
