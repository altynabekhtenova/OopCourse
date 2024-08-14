package ru.academits.arefieva.shapes;

import java.util.Comparator;

public class MaxPerimeterComparator implements Comparator<Shapes> {
    @Override
    public int compare(Shapes s1, Shapes s2) {
        return (int) (s1.getPerimeter() - s2.getPerimeter());
    }
}
