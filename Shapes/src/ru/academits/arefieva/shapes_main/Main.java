package ru.academits.arefieva.shapes_main;

import ru.academits.arefieva.shape_comparators.ShapeAreaComparator;
import ru.academits.arefieva.shape_comparators.ShapePerimeterComparator;
import ru.academits.arefieva.shapes.*;

import java.util.Arrays;

public class Main {
    public static Shape getMaxAreaShape(Shape[] shapes) {
        Arrays.sort(shapes, new ShapeAreaComparator());

        return shapes[shapes.length - 1];
    }

    public static Shape getSecondMaxPerimeterShape(Shape[] shapes) {
        Arrays.sort(shapes, new ShapePerimeterComparator());

        return shapes[shapes.length - 2];
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(4),
                new Square(45),
                new Triangle(-100, 2, 4, 2, 11, 115),
                new Triangle(5, 8, -5, 2, 9, 15),
                new Rectangle(2, 4),
                new Rectangle(12, 1),
                new Circle(60),
                new Circle(5)
        };

        System.out.printf("Фигура с максимальной площадью - %s%n",
                getMaxAreaShape(shapes));
        System.out.printf("Фигура со вторым по величине периметром - %s",
                getSecondMaxPerimeterShape(shapes));
    }
}
