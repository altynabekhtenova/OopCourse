package ru.academits.arefieva.vector;

import java.util.Arrays;

public class Vector {
    private double[] components;

    public Vector(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size (" + size + ") of vector must be > 0");
        }

        components = new double[size];
    }

    public Vector(Vector vector) {
        components = Arrays.copyOf(vector.components, vector.components.length);
    }

    public Vector(double[] components) {
        if (components.length == 0) {
            throw new IllegalArgumentException("Size (" + components.length + ") of vector must be > 0");
        }

        this.components = Arrays.copyOf(components, components.length);
    }

    public Vector(int size, double[] components) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size (" + size + ") of vector must be > 0");
        }

        this.components = Arrays.copyOf(components, size);
    }

    public int getSize() {
        return components.length;
    }

    public void add(Vector vector) {
        if (vector.components.length > components.length) {
            components = Arrays.copyOf(components, vector.components.length);
        }

        for (int i = 0; i < vector.components.length; i++) {
            components[i] += vector.components[i];
        }
    }

    public void subtract(Vector vector) {
        if (vector.components.length > components.length) {
            components = Arrays.copyOf(components, vector.components.length);
        }

        for (int i = 0; i < vector.components.length; i++) {
            components[i] -= vector.components[i];
        }
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < components.length; i++) {
            components[i] *= scalar;
        }
    }

    public void reverse() {
        multiplyByScalar(-1);
    }

    public double getLength() {
        double componentsSquaresSum = 0;

        for (double component : components) {
            componentsSquaresSum += component * component;
        }

        return Math.sqrt(componentsSquaresSum);
    }

    public double getComponentByIndex(int index) {
        return components[index];
    }

    public void setComponentByIndex(int index, double component) {
        components[index] = component;
    }

    public static Vector getSum(Vector vector1, Vector vector2) {
        Vector resultingVector = new Vector(vector1);

        resultingVector.add(vector2);

        return resultingVector;
    }

    public static Vector getDifference(Vector vector1, Vector vector2) {
        Vector resultingVector = new Vector(vector1);

        resultingVector.subtract(vector2);

        return resultingVector;
    }

    public static double getScalarProduct(Vector vector1, Vector vector2) {
        double result = 0;
        int minSize = Math.min(vector1.components.length, vector2.components.length);

        for (int i = 0; i < minSize; i++) {
            result += vector1.components[i] * vector2.components[i];
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder vectorInBraces = new StringBuilder();

        vectorInBraces.append("{");

        for (int i = 0; i < components.length - 1; i++) {
            vectorInBraces.append(components[i]).append(", ");
        }

        vectorInBraces.append(components[components.length - 1]).append("}");

        return vectorInBraces.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 37;

        int hash = 1;
        hash = prime * hash + Arrays.hashCode(components);

        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Vector vector = (Vector) o;
        return Arrays.equals(components, vector.components);
    }
}
