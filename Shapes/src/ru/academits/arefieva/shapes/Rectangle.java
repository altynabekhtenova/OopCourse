package ru.academits.arefieva.shapes;

public class Rectangle implements Shapes {
    private double width;
    private double height;

    public Rectangle(double width, double sideLength2) {
        this.width = width;
        this.height = sideLength2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Прямоугольник с шириной: " + width + " и высотой: " + height;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(width);
        hash = prime * hash + Double.hashCode(height);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != getClass()) return false;

        Rectangle r = (Rectangle) o;
        return width == r.width && height == r.height;
    }
}
