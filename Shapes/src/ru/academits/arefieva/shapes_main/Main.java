package ru.academits.arefieva.shapes_main;

import ru.academits.arefieva.comparators_shapes.ShapeAreaComparator;
import ru.academits.arefieva.comparators_shapes.ShapePerimeterComparator;
import ru.academits.arefieva.shapes.*;

import java.util.Arrays;

public class Main {
    public static Shape getMaxAreaShape(Shape[] shapes) {
        Arrays.sort(shapes, new ShapeAreaComparator().reversed());

        return shapes[0];
    }

    public static Shape getSecondMaxPerimeterShape(Shape[] shapes) {
        Arrays.sort(shapes, new ShapePerimeterComparator().reversed());

        return shapes[1];
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

        System.out.printf("Фигура с максимальной площадью - %s c шириной %.1f и высотой %.1f%n",
                getMaxAreaShape(shapes),
                getMaxAreaShape(shapes).getWidth(),
                getMaxAreaShape(shapes).getHeight());
        System.out.printf("Фигура со вторым по величине периметром - %s c шириной %.1f и высотой %.1f%n",
                getSecondMaxPerimeterShape(shapes),
                getSecondMaxPerimeterShape(shapes).getWidth(),
                getSecondMaxPerimeterShape(shapes).getHeight());
    }
}
