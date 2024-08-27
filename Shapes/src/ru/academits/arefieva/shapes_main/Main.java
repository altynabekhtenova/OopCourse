package ru.academits.arefieva.shapes_main;

import ru.academits.arefieva.comparators.FigureAreaComparator;
import ru.academits.arefieva.comparators.FigurePerimeterComparator;
import ru.academits.arefieva.shapes.*;

import java.util.Arrays;

public class Main {
    public static Shape getMaxAreaFigure(Shape[] figures) {
        Arrays.sort(figures, new FigureAreaComparator().reversed());

        return figures[0];
    }

    public static Shape getSecondMaxPerimeterFigure(Shape[] figures) {
        Arrays.sort(figures, new FigurePerimeterComparator().reversed());

        return figures[1];
    }

    public static void main(String[] args) {
        Shape[] figures = {new Square(40), new Square(15),
                new Triangle(1, 2, 4, 2, 11, 115),
                new Triangle(5, 8, -5, 2, 9, 15),
                new Rectangle(2, 4), new Rectangle(12, 1),
                new Circle(600), new Circle(5)};

        System.out.printf("Фигура с максимальной площадью - %s%n", getMaxAreaFigure(figures));
        System.out.printf("Фигура со вторым по величине периметром - %s", getSecondMaxPerimeterFigure(figures));
    }
}
