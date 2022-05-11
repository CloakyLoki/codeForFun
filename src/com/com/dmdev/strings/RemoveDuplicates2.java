package com.com.dmdev.strings;
/*
Дана строка.
Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
Результат привести к верхнему регистру.

Например:
"abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class RemoveDuplicates2 {

    public static void main(String[] args) {
//        System.out.println("A".equals(toUpper('a') + ""));
//        System.out.println("#123ABCPDIOSFW".equals(clearDuplicates("  #123abc Cpddd Dio OsfWw")));

        System.out.println(clearDuplicates2("   #123abc Cpddd Dio OsfWw"));
        System.out.println("#123ABCPDIOSFW".equals(clearDuplicates2("   #123abc Cpddd Dio OsfWw")));
    }

    private static String clearDuplicates2(String target) {
        if (target != null) {
            char[] chars = target.toCharArray();
            int pointer = 0;

            for (int i = 0; i < chars.length; i++) {
                char cur = chars[i];
                if (cur != 32) {
                    cur = toUpper(cur);
                    if (chars[pointer] == 32 || chars[pointer - 1] != cur) {
                        chars[pointer] = cur;
                        pointer++;
                    }
                }
            }
            return new String(chars, 0, pointer);
        } else {
            throw new RuntimeException("Входной параметр - null");
        }
    }

    private static char toUpper(char target) {
        if (target >= 97 && target <= 122) {
            target = (char) (target - 32);
        }
        return target;
    }
}
