package com.company;

public class Console {

    static void writeLine(Object string) {
        System.out.println(string);
    }

    static void writeLine(Object string, ConsoleColor color) {
        System.out.print(color);
        writeLine(string);
        System.out.print(color);
    }

    static void writeLine() {
        System.out.println();
    }

    static void write(Object string, ConsoleColor color) {
        write(color);
        write(string);
        write(color);
    }

    static void write(Object string) {
        System.out.print(string);
    }
}