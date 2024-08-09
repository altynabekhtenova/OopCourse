package ru.academits.arefieva.shapes;

public class Circle extends Shapes {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return radius + radius;
    }

    public double getHeight() {
        return radius + radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
