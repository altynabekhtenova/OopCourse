package ru.academits.arefieva.shapes;

public class Circle extends Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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

    @Override
    public String toString() {
        return "Окружность с радиусом: " + radius;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != getClass()) return false;

        Circle c = (Circle) o;
        return radius == c.radius;
    }
}
