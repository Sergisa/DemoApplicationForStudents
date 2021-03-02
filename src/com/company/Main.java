package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static BufferedReader bufferedReader;
    public static void main(String[] args) {
        try {
            bufferedReader = new BufferedReader(new FileReader("src/com/company/data.txt"));
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
