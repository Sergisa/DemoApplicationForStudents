package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static BufferedReader bufferedReader;
    public static void main(String[] args) {
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/com/company/data.txt"));
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
