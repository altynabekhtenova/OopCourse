package ru.academits.arefieva.arraylisthome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileLines {
    public static ArrayList<String> readFileLines(BufferedReader reader) throws IOException {
        ArrayList<String> fileLines = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            fileLines.add(line);
        }

        return fileLines;
    }

    public static void main(String[] args) {
        String fileName = "input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println(readFileLines(reader));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }
    }
}
