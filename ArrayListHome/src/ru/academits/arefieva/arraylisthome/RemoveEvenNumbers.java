package ru.academits.arefieva.arraylisthome;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenNumbers {
    public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 8, 1, 10, 3, 11, 178, 0, 4, 9, 12));

        System.out.println("Список целых чисел: " + numbers);
        System.out.println("Список целых чисел без четных чисел: " + removeEvenNumbers(numbers));
    }
}
