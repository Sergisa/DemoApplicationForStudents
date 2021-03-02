package com.company;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    static FileReader reader;

    public static void main(String[] args) {
        try {
            reader = new FileReader("src/com/company/data.txt");
            while (reader.ready()){
                char data = (char)reader.read();
                System.out.print(data);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
