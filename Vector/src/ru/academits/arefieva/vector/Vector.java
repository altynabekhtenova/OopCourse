package ru.academits.arefieva.vector;

import java.util.Arrays;

public class Vector {
    private int n;
    private double[] vector;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        } else {
            double[] vector = new double[n];

            int i;
            for (i = 0; i < n; i++) {
                vector[i] = 0;
            }

            this.vector = vector;
            this.n = n;
        }
    }

    public Vector(Vector vector) {
        this.n = vector.n;
        this.vector = vector.vector;
    }

    public Vector(double[] vector) {
        this.vector = vector;
    }

    public Vector(int n, double[] vector) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }

        if (n <= vector.length) {
            this.vector = vector;
        } else {
            double[] newVector = new double[n];

            for (int i = 0; i < n; i++) {
                if (i < vector.length) {
                    newVector[i] = vector[i];
                } else {
                    newVector[i] = 0;
                }
            }

            this.vector = newVector;
        }
    }

    public int getSize() {
        return n;
    }

    public void setSize(int n) {
        this.n = n;
    }

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public Vector addTwoVectors(Vector vector) {
        for (int i = 0; i < Math.max(this.vector.length, vector.getVector().length); i++) {
            vector.getVector()[i] += this.vector[i];
        }

        return vector;
    }

    public Vector subtractVectorFromVector(Vector vector) {
        for (int i = 0; i < Math.min(this.vector.length, vector.getVector().length); i++) {
            vector.getVector()[i] -= this.vector[i];
        }

        return vector;
    }

    public Vector multiplyVectorByScalar(int scalar) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= scalar;
        }

        return new Vector(vector);
    }

    public Vector expandVector(Vector vector) {
        for (int i = 0; i < vector.getVector().length; i++) {
            vector.getVector()[i] *= -1;
        }

        return new Vector(vector);
    }

    public int getVectorLength() {
        return vector.length;
    }

    public double getVectorComponentByIndex(int index) {
        double vectorComponent = 0;

        for (int i = 0; i < vector.length; i++) {
            if (i == index) {
                vectorComponent = vector[i];
            }
        }

        return vectorComponent;
    }

    public Vector setVectorComponentByIndex(double component, int index) {
        for (int i = 0; i < vector.length; i++) {
            if (i == index) {
                vector[i] = component;
            }
        }

        return new Vector(vector);
    }

    public static Vector addTwoVectors(Vector vector1, Vector vector2) {
        Vector resultVector = new Vector(Math.max(vector1.getVector().length, vector2.getVector().length));

        for (int i = 0; i < resultVector.getVector().length; i++) {
            resultVector.getVector()[i] = vector1.getVector()[i] + vector1.getVector()[i];
        }

        return resultVector;
    }

    public static Vector subtractVectorFromVector(Vector vector1, Vector vector2) {
        Vector resultVector = new Vector(Math.max(vector1.getVector().length, vector2.getVector().length));

        for (int i = 0; i < resultVector.getVector().length; i++) {
            resultVector.getVector()[i] = vector1.getVector()[i] - vector1.getVector()[i];
        }

        return resultVector;
    }

    public static Vector getVectorsProduct(Vector vector1, Vector vector2) {
        Vector resultVector = new Vector(Math.max(vector1.getVector().length, vector2.getVector().length));

        for (int i = 0; i < resultVector.getVector().length; i++) {
            resultVector.getVector()[i] = vector1.getVector()[i] * vector1.getVector()[i];
        }

        return resultVector;
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(vector) + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + n;
        hash = prime * hash + Arrays.hashCode(vector);
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

        Vector v = (Vector) o;

        if (v.n == this.n && v.getVector() == vector) {
            return true;
        }

        return vector == v.vector;
    }
}
