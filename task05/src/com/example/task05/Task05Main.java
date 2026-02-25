package com.example.task05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Task05Main {
    public static void main(String[] args) {
        String pathToFile = args[0]; // "/home/user/file.txt"
        try {
            String s = readFile(pathToFile);
            System.out.println(s);
        } catch (FileNotFoundException e){
            throw new RuntimeException("файл \"" + pathToFile + "\" не найден");
        } catch (IOException e) {
            throw new RuntimeException("произошла ошибка при чтении файла \"" + pathToFile + "\" не найден");
        }
    }

    public static String readFile(String pathToFile) throws IOException {
        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();
        String currentLine;
        while ((currentLine = bufferedReader.readLine()) != null) {
            stringBuilder.append(currentLine);
            stringBuilder.append("\n");
        }
        bufferedReader.close();

        return stringBuilder.toString();
    }
}