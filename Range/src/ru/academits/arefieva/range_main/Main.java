package ru.academits.arefieva.range_main;

import ru.academits.arefieva.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(1, 3);
        Range range2 = new Range(6, 10);

        range1.printIntersection(range2);
        range1.printUnion(range2);
        range1.printDifference(range2);

        range1.setFrom(6);
        range1.setTo(10);
        range2.setFrom(1);
        range2.setTo(3);

        range1.printIntersection(range2);
        range1.printUnion(range2);
        range1.printDifference(range2);

        range1.setFrom(1);
        range1.setTo(16);
        range2.setFrom(9);
        range2.setTo(13);

        range1.printIntersection(range2);
        range1.printUnion(range2);
        range1.printDifference(range2);

        range1.setFrom(9);
        range1.setTo(13);
        range2.setFrom(1);
        range2.setTo(16);

        range1.printIntersection(range2);
        range1.printUnion(range2);
        range1.printDifference(range2);

        range1.setFrom(1);
        range1.setTo(9);
        range2.setFrom(6);
        range2.setTo(15);

        range1.printIntersection(range2);
        range1.printUnion(range2);
        range1.printDifference(range2);

        range1.setFrom(6);
        range1.setTo(15);
        range2.setFrom(1);
        range2.setTo(9);

        range1.printIntersection(range2);
        range1.printUnion(range2);
        range1.printDifference(range2);

        range1.setFrom(1);
        range1.setTo(6);
        range2.setFrom(6);
        range2.setTo(9);

        range1.printIntersection(range2);
        range1.printUnion(range2);
        range1.printDifference(range2);
    }
}
