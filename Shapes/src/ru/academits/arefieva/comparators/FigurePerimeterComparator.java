package ru.academits.arefieva.comparators;

import ru.academits.arefieva.shapes.Shape;

import java.util.Comparator;

public class FigurePerimeterComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape figure1, Shape figure2) {
        return Double.compare(figure1.getPerimeter(), figure2.getPerimeter());
    }
}