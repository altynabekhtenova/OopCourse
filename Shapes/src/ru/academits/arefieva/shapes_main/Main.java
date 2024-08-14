package ru.academits.arefieva.shapes_main;

import ru.academits.arefieva.shapes.*;

import java.util.Arrays;

public class Main {
    public static String getMaxAreaFigure(Shapes[] shapes) {
        double maxArea = shapes[0].getArea();
        int maxAreaFigureNumber = 0;

        for (int i = 1; i < shapes.length; ++i) {
            if (shapes[i].getArea() > maxArea) {
                maxArea = shapes[i].getArea();
                maxAreaFigureNumber = i;
            }
        }

        return shapes[maxAreaFigureNumber].toString();
    }

    public static String getSecondMaxPerimeterFigure(Shapes[] shapes) {
        Arrays.sort(shapes, new MaxPerimeterComparator().reversed());

        return shapes[1].toString();
    }

    public static void main(String[] args) {
        Square square1 = new Square(40);
        Square square2 = new Square(15);
        Triangle triangle1 = new Triangle(1, 2, 4, 2, 11, 115);
        Triangle triangle2 = new Triangle(5, 8, -5, 2, 9, 15);
        Rectangle rectangle1 = new Rectangle(2, 4);
        Rectangle rectangle2 = new Rectangle(12, 1);
        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(5);

        Shapes[] shapes = new Shapes[]{square1, square2, triangle1, triangle2, rectangle1, rectangle2, circle1, circle2};
        System.out.printf("Фигура с максимальной площадью - %s%n", getMaxAreaFigure(shapes));
        System.out.printf("Фигура со вторым по величине периметром - %s", getSecondMaxPerimeterFigure(shapes));
    }
}
