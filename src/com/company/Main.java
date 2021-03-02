package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    static ArgumentKeeper keeper;
    public static void main(String[] args) {
        keeper = new ArgumentKeeper(args);
        System.out.println(keeper.getKeyValue("-f"));
        System.out.println(Arrays.toString(keeper.getKeyValues("-a",3)));
        System.out.println(keeper.check("--special"));
        System.out.println(keeper.check("--unspecial"));
    }

}
