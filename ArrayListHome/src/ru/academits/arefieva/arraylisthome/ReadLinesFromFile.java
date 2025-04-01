package ru.academits.arefieva.arraylisthome;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadLinesFromFile {
    public static ArrayList<String> readLinesFromFile(String fileName) {
        BufferedReader reader = getBufferedReader(fileName);

        ArrayList<String> linesFromFile = new ArrayList<>();
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                linesFromFile.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла: " + e.getMessage());
        }

        return linesFromFile;
    }

    private static BufferedReader getBufferedReader(String fileName) {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(fileName));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при поиске файла: " + e.getMessage());
        }

        return reader;
    }

    public static void main(String[] args) {
        String fileName = "input.txt";

        System.out.println(readLinesFromFile(fileName));
    }
}
