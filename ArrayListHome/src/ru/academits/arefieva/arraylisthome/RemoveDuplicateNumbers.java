package ru.academits.arefieva.arraylisthome;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 8, 10, 3, 11, 178, 0, 4, 9, 8, 10, 178));

        System.out.println("Список целых чисел: " + list);

        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>();

        for (Integer integer : list) {
            boolean hasDuplicate = listWithoutDuplicates.contains(integer);

            if (!hasDuplicate) {
                listWithoutDuplicates.add(integer);
            }
        }

        System.out.println("Список целых чисел без повторений: " + listWithoutDuplicates);
    }
}
