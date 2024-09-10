package ru.academits.arefieva.vector_main;

import ru.academits.arefieva.vector.Vector;

import static ru.academits.arefieva.vector.Vector.*;

public class Main {
    public static void main(String[] args) {
        double[] vectorArray1 = {1, 6, 4, 9, 10, 15, 17};
        double[] vectorArray2 = {11, 2, 4, 1, 11, 12};

        Vector vector1 = new Vector(Math.max(vectorArray1.length, vectorArray2.length), vectorArray1);
        Vector vector2 = new Vector(Math.max(vectorArray1.length, vectorArray2.length), vectorArray2);

        System.out.println("Результат сложения двух векторов - " + vector1.addTwoVectors(vector2));
        System.out.println("Результат вычитание одного вектора из другого - " + vector1.subtractVectorFromVector(vector2));
        System.out.println("Результат умножения вектора на скаляр - " + vector1.multiplyVectorByScalar(6));
        System.out.println("Результат разворота вектора - " + vector1.expandVector(vector1));
        System.out.println("Длина вектора - " + vector1.getVectorLength());
        System.out.println("Компонента вектора по индексу - " + vector1.getVectorComponentByIndex(3));
        System.out.println("Вектор с новым значением по индексу - " + vector1.setVectorComponentByIndex(3.5, 3));
        System.out.println("Результат сложения двух векторов с созданием нового вектора - " + addTwoVectors(vector1, vector2));
        System.out.println("Результат вычитания одного вектора из другого с созданием нового вектора - " + subtractVectorFromVector(vector1, vector2));
        System.out.println("Результат результат произведения векторов с созданием нового вектора - " + getVectorsProduct(vector1, vector2));
    }
}
