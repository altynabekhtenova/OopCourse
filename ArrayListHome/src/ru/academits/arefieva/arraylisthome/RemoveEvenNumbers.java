package ru.academits.arefieva.arraylisthome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveEvenNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 8, 10, 3, 11, 178, 0, 4, 9));

        System.out.println("Список целых чисел: " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.println("Список целых чисел без четных чисел: " + list);
    }
}
