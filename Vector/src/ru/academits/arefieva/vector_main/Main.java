package ru.academits.arefieva.vector_main;

import ru.academits.arefieva.vector.Vector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] vectorComponents1 = {2, 2, 2, 2};
        double[] vectorComponents2 = {11, 2, 10, 5, 8, 10};

        Vector vector1 = new Vector(Math.max(vectorComponents1.length, vectorComponents2.length), vectorComponents1);
        Vector vector2 = new Vector(Math.max(vectorComponents1.length, vectorComponents2.length), vectorComponents2);

        vector1.add(vector2);
        System.out.println("Результат сложения двух векторов = " + vector1);

        vector1.subtract(vector2);
        System.out.println("Результат вычитания одного вектора из другого = " + vector1);

        vector1.multiplyByScalar(6);
        System.out.println("Результат умножения вектора на скаляр = " + vector1);

        vector1.reverse();
        System.out.println("Результат разворота вектора = " + vector1);

        System.out.println("Длина вектора = " + vector1.getLength());
        System.out.println("Компонента вектора по индексу = " + vector1.getComponentByIndex(0));

        vector1.setComponentByIndex(3, 5);
        System.out.println("Вектор с новым значением по индексу = " + vector1);

        System.out.println("Результат сложения двух векторов с созданием нового вектора = " + Vector.getSum(vector1, vector2));
        System.out.println("Результат вычитания одного вектора из другого с созданием нового вектора = " + Vector.getDifference(vector1, vector2));
        System.out.println("Результат скалярного произведение векторов = " + Vector.getScalarProduct(vector1, vector2));
    }
}
