package ru.academits.arefieva.vector;

import java.util.Arrays;

public class Vector {
    private double[] components;

    public double[] getComponents() {
        return components;
    }

    public void setComponents(double[] components) {
        this.components = components;
    }

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
        int maxVectorLength = Math.max(components.length, vector.components.length);

        for (int i = 0; i < maxVectorLength; i++) {
            components[i] += vector.components[i];
        }
    }

    public void subtract(Vector vector) {
        int minVectorLength = Math.max(components.length, vector.components.length);

        for (int i = 0; i < minVectorLength; i++) {
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

    public int getVectorLength() {
        double componentsSum = 0;

        for (double component : components) {
            componentsSum += Math.pow(component, 2);
        }

        return (int) Math.sqrt(componentsSum);
    }

    public double getComponentByIndex(int index) {
        return components[index];
    }

    public void setComponentByIndex(double component, int index) {
        components[index] = component;
    }

    public static Vector getSum(Vector vector1, Vector vector2) {
        Vector vectorResult = new Vector(vector1);

        vectorResult.add(vector2);

        return vectorResult;
    }

    public static Vector getDifference(Vector vector1, Vector vector2) {
        Vector vectorResult = new Vector(vector1);

        vectorResult.subtract(vector2);

        return vectorResult;
    }

    public static double getScalarMultiplication(Vector vector1, Vector vector2) {
        double result = 0;
        int minLength = Math.min(vector1.components.length, vector2.components.length);

        for (int i = 0; i < minLength; i++) {
            result = vector1.components[i] * vector2.components[i];
        }

        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(components);
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
