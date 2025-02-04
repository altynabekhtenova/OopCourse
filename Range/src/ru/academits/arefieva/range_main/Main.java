package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] from = {-4, 5, 6, -9, 9, 10};
        double[] to = {10, 11, 12, 13, 20, 22};

        Range range1 = new Range(0, 13);
        Range range2 = new Range(from[0], to[0]);

        for (double value : from) {
            for (double v : to) {
                range2.setFrom(value);
                range2.setTo(v);

                System.out.printf("Результат пересечения диапазонов (0.0; 13.0) и (%.1f; %.1f) = %s%n",
                        value, v, range1.getIntersection(range2));
                System.out.printf("Результат объединения диапазонов (0.0; 13.0) и (%.1f; %.1f) = %s%n",
                        value, v, Arrays.toString(range1.getUnion(range2)));
                System.out.printf("Результат разности диапазонов (0.0; 13.0) и (%.1f; %.1f) = %s%n%n",
                        value, v, Arrays.toString(range1.getDifference(range2)));
            }
        }
    }
}
