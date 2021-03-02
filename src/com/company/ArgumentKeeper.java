package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArgumentKeeper {
    List<String> arguments;
    public ArgumentKeeper(String[] args) {
        arguments = Arrays.asList(args);
    }

    public ArgumentKeeper(List<String> args) {
        arguments = args;
    }

    public String[] getKeyValues(String key, int amount){
        ArrayList<String> values = new ArrayList<>();
        int keyIndex = this.arguments.indexOf(key);
        try {
            for (int i = 0; i < amount; i++) {
                values.add(this.arguments.get(keyIndex + i + 1));
            }
        }catch(ArrayIndexOutOfBoundsException e){

        }
        return values.toArray(new String[]{});
    }
    public String getKeyValue(String key){
        return getKeyValues(key, 1)[0];
    }

    public boolean check(String key){
        if (key.contains("--")) {
            return arguments.contains(key);
        }
        return false;
    }
}
