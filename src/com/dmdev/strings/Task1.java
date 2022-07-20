package com.dmdev.strings;

/*
Заменить все грустные смайлы в строке на весёлые
 */
public class Task1 {

    public static void main(String[] args) {
        String originalString = "Завтра :( не нужно :) на работу :(";
        String replacedString = replaceSmiles(originalString);
        System.out.println(replacedString);

    }
    public static String replaceSmiles(String value){
        return value.replace(":(", ":)");
    }
}
