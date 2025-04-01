package ru.academits.arefieva.arraylisthome;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateNumbers {
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(numbers.size());

        for (Integer number : numbers) {
            if (!listWithoutDuplicates.contains(number)) {
                listWithoutDuplicates.add(number);
            }
        }

        return listWithoutDuplicates;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 8, 10, 3, 11, 178, 0, 4, 9, 8, 10, 178));

        System.out.println("Список целых чисел: " + numbers);
        System.out.println("Список целых чисел без повторений: " + removeDuplicateNumbers(numbers));
    }
}
