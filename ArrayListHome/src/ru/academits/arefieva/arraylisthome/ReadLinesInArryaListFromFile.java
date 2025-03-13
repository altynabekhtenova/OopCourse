package ru.academits.arefieva.arraylisthome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ReadLinesInArryaListFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
