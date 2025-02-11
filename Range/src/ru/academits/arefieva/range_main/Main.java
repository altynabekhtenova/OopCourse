package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(-10, 19);

        double[] fromSet = {-4, 5, 6, -9, 9, 10};
        double[] toSet = {10, 11, 12, 13, 20, 22};

        Range range2 = new Range(fromSet[0], toSet[0]);

        for (double range2From : fromSet) {
            for (double range2To : toSet) {
                range2.setFrom(range2From);
                range2.setTo(range2To);

                System.out.printf("Результат пересечения диапазонов (%.1f; %.1f) и (%.1f; %.1f) = %s%n",
                        range1.getFrom(), range1.getTo(), range2From, range2To,
                        range1.getIntersection(range2));
                System.out.printf("Результат объединения диапазонов (%.1f; %.1f) и (%.1f; %.1f) = %s%n",
                        range1.getFrom(), range1.getTo(), range2From, range2To,
                        Arrays.toString(range1.getUnion(range2)));
                System.out.printf("Результат разности диапазонов (%.1f; %.1f) и (%.1f; %.1f) = %s%n%n",
                        range1.getFrom(), range1.getTo(), range2From, range2To,
                        Arrays.toString(range1.getDifference(range2)));
            }
        }
    }
}
