package com.dmdev.strings;

import java.util.Arrays;

/*
Дана строка с текстом, в котором есть цифры от 0 до 9.
Написать 2 метода:
- возвращающий массив цифр из переданной строки
- возвращающий сумму цифр из переданного целочисленного массива

Посчитать сумму всех чисел из строки

Например:
“Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Homework2 {

    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела0? Может4, сделать 3 дело?";
        System.out.println(Arrays.toString(convertStringToInt(value)));
        System.out.println("Сумма элементов равна " + getSumNumbers(convertStringToInt(value)));

    }
    private static int[] convertStringToInt(String inputString){
        String numbers = "0123456789";
        String numStr = "";

        for (int i = 0; i < inputString.length(); i++) {
            if (numbers.contains(inputString.substring(i, i + 1))){
                numStr += inputString.substring(i, i + 1);
            }
        }
        int[] result = new  int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = numStr.charAt(i) - '0';
        }
        return result;
    }

    private static int getSumNumbers(int[] numsArray){
    int sum = 0;
        for (int i = 0; i < numsArray.length; i++) {
            sum += numsArray[i];
        }
        return sum;
    }
}
