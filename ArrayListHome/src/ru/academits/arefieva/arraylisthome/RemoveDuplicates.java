package ru.academits.arefieva.arraylisthome;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> items) {
        ArrayList<T> listWithoutDuplicates = new ArrayList<>(items.size());

        for (T item : items) {
            if (!listWithoutDuplicates.contains(item)) {
                listWithoutDuplicates.add(item);
            }
        }

        return listWithoutDuplicates;
    }

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>(Arrays.asList(0, 6, 9, 1, 0, 10, 6, 15, 8, 1));

        System.out.println("Список целых чисел: " + items);
        System.out.println("Список целых чисел без повторений: " + removeDuplicates(items));

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("first", "second", "first", "second", "third"));

        System.out.println("Список строк: " + strings);
        System.out.println("Список строк без повторений: " + removeDuplicates(strings));
    }
}
