package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static BufferedReader bufferedReader;
    public static void main(String[] args) {
        String line;
        File file = new File("src/com/company/data.txt");
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
