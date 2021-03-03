package com.company;

public class Console {

    static void writeLine(Object string) {
        System.out.println(string);
    }

    static void writeLine(Object string, String color) {
        System.out.print(color);
        writeLine(string);
        System.out.print(ConsoleColor.RESET);
    }

    static void writeLine() {
        System.out.println();
    }

    static void write(Object string, String color) {
        write(color);
        write(string);
        write(ConsoleColor.RESET);
    }

    static void write(Object string) {
        System.out.print(string);
    }
}