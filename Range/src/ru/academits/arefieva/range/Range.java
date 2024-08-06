package ru.academits.arefieva.range;

public class Range {
    private final double from;
    private final double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public Range[] getIntersection(Range other) {
        if (this.from > other.to || this.to < other.from) {
            return null;
        } else {
            return new Range[]{new Range(Math.max(this.from, other.from), Math.min(this.to, other.to))};
        }
    }

    public Range[] getJoin(Range other) {
        if (this.from > other.to || this.to < other.from) {
            return new Range[]{new Range(this.from, this.to), new Range(other.from, other.to)};
        } else {
            return new Range[]{new Range(Math.min(this.from, other.from), Math.max(this.to, other.to))};
        }
    }

    public Range[] getDifference(Range other) {
        if (this.from > other.from && this.to < other.to) {
            return new Range[]{};
        } else if (this.from > other.from && this.to > other.to) {
            return new Range[]{new Range(other.to, this.to)};
        } else if (this.from < other.from && this.to > other.to) {
            return new Range[]{new Range(this.from, other.from), new Range(other.to, this.to)};
        } else {
            return new Range[]{new Range(this.from, Math.min(other.from, this.to))};
        }
    }

    @Override
    public String toString() {
        return "(" + from + ", " + to + ")";
    }
}