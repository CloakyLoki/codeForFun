package com.codewars;

public class Task1 {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder result = new StringBuilder();
            int i = repeat;
            while (i > 0){
                result.append(string);
                i--;
        }
        return result.toString();
    }
}
