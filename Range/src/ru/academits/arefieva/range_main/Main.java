package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(1, 3);
        Range range2 = new Range(6, 10);
        System.out.printf("Результат пересечения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), range1.getIntersection(range2));
        System.out.printf("Результат объединения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getUnion(range2)));
        System.out.printf("Результат разности двух интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getDifference(range2)));

        range1.setFrom(6);
        range1.setTo(10);
        range2.setFrom(1);
        range2.setTo(3);
        System.out.printf("Результат пересечения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), range1.getIntersection(range2));
        System.out.printf("Результат объединения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getUnion(range2)));
        System.out.printf("Результат разности двух интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getDifference(range2)));

        range1.setFrom(1);
        range1.setTo(16);
        range2.setFrom(9);
        range2.setTo(13);
        System.out.printf("Результат пересечения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), range1.getIntersection(range2));
        System.out.printf("Результат объединения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getUnion(range2)));
        System.out.printf("Результат разности двух интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getDifference(range2)));

        range1.setFrom(9);
        range1.setTo(13);
        range2.setFrom(1);
        range2.setTo(16);
        System.out.printf("Результат пересечения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), range1.getIntersection(range2));
        System.out.printf("Результат объединения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getUnion(range2)));
        System.out.printf("Результат разности двух интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getDifference(range2)));

        range1.setFrom(1);
        range1.setTo(9);
        range2.setFrom(6);
        range2.setTo(15);
        System.out.printf("Результат пересечения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), range1.getIntersection(range2));
        System.out.printf("Результат объединения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getUnion(range2)));
        System.out.printf("Результат разности двух интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getDifference(range2)));

        range1.setFrom(6);
        range1.setTo(15);
        range2.setFrom(1);
        range2.setTo(9);
        System.out.printf("Результат пересечения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), range1.getIntersection(range2));
        System.out.printf("Результат объединения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getUnion(range2)));
        System.out.printf("Результат разности двух интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getDifference(range2)));

        range1.setFrom(1);
        range1.setTo(6);
        range2.setFrom(6);
        range2.setTo(9);
        System.out.printf("Результат пересечения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), range1.getIntersection(range2));
        System.out.printf("Результат объединения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getUnion(range2)));
        System.out.printf("Результат разности двух интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                range1.getFrom(), range1.getTo(), range2.getFrom(), range2.getTo(), Arrays.toString(range1.getDifference(range2)));
    }
}
