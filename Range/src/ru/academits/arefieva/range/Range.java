package ru.academits.arefieva.range;

import java.util.Arrays;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        final double epsilon = 1.0e-10;
        return number - from >= -epsilon && to - number >= -epsilon;
    }

    public Range getIntersection(Range range) {
        if (from >= range.to || to <= range.from) {
            return null;
        }

        return new Range(Math.max(from, range.from), Math.min(to, range.to));
    }

    public Range[] getUnion(Range range) {
        Range[] unionResult;

        if (to < range.from || range.to < from) {
            unionResult = new Range[]{new Range(from, to), new Range(range.from, range.to)};
        } else {
            unionResult = new Range[]{new Range(Math.min(from, range.from), Math.max(to, range.to))};
        }

        return unionResult;
    }

    public Range[] getDifference(Range range) {
        Range[] differenceResult;

        if (from > range.from && to < range.to) {
            differenceResult = new Range[]{};
        } else if (from > range.from && to > range.to) {
            differenceResult = new Range[]{new Range(Math.max(from, range.to), to)};
        } else if (from < range.from && to > range.to) {
            differenceResult = new Range[]{new Range(from, range.from), new Range(range.to, to)};
        } else {
            differenceResult = new Range[]{new Range(from, Math.min(range.from, to))};
        }

        return differenceResult;
    }

    public void printIntersection(Range range) {
        System.out.printf("Результат пересечения интервалов (%.1f; %.1f) и (%.0f; %.0f) = %s%n",
                from, to, range.getFrom(), range.getTo(), getIntersection(range));
    }

    public void printUnion(Range range) {
        System.out.printf("Результат объединения интервалов (%.1f; %.1f) и (%.1f; %.1f) = %s%n",
                from, to, range.getFrom(), range.getTo(), Arrays.toString(getUnion(range)));
    }

    public void printDifference(Range range) {
        System.out.printf("Результат разности двух интервалов (%.1f; %.1f) и (%.1f; %.1f) = %s%n%n",
                from, to, range.getFrom(), range.getTo(), Arrays.toString(getDifference(range)));
    }

    @Override
    public String toString() {
        return "(" + from + ", " + to + ")";
    }
}