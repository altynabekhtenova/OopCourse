package ru.academits.arefieva.range;

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
        return number <= to && number >= from;
    }

    public Range getIntersection(Range range) {
        Range intersectionResult;

        if (from >= range.to || to <= range.from) {
            intersectionResult = null;
        } else {
            intersectionResult = new Range(Math.max(from, range.from), Math.min(to, range.to));
        }

        return intersectionResult;
    }

    public Range[] getUnion(Range range) {
        Range[] unionResult;

        if (from > range.to || to < range.from) {
            unionResult = new Range[]{new Range(from, range.from), new Range(range.from, range.to)};
        } else {
            unionResult = new Range[]{(new Range(Math.min(from, range.from), Math.max(to, range.to)))};
        }

        return unionResult;
    }

    public Range[] getDifference(Range range) {
        Range[] differenceResult;

        if (from >= range.from && to <= range.to) {
            differenceResult = null;
        } else if (from < range.from && to > range.to) {
            differenceResult = new Range[]{(new Range(from, range.from)), (new Range(range.to, to))};
        } else if (to > range.to) {
            differenceResult = new Range[]{new Range(Math.max(from, range.to), to)};
        } else {
            differenceResult = new Range[]{new Range(from, Math.min(range.from, to))};
        }

        return differenceResult;
    }

    @Override
    public String toString() {
        return "(" + from + ", " + to + ")";
    }
}
