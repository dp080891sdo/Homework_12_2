package com.sviatukhov;

import java.util.Arrays;

public class Main {
    /*
    2*) Задана строка из английских слов через пробел.
    Написать метод который возвращает те же слова в обратном порядке.
    При этом слова изменены так что в каждом слове первая буква большая а остальные маленькие.


     */
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet consectetuer adipiscing elit";
        System.out.println(string);
        stringCut(string);
    }


    public static void stringCut(String string) {
        String str = string;
        String[] subStr;
        String delimeter = " ";
        subStr = str.split(delimeter);

        for (int i = 0; i < subStr.length; i++) {
            subStr[i] = subStr[i].substring(0, 1).toUpperCase() + subStr[i].substring(1).toLowerCase();
        }
        String[] stringNew = new String[subStr.length];
        for (int j = subStr.length - 1; j >= 0; j--) {
            stringNew[j] = subStr[subStr.length - 1 - j];
        }

        String result = Arrays.toString(stringNew);
        String stringMiddle = result.replace(",", "");
        String stringMiddle2 = stringMiddle.replace("]", "");
        String rez = stringMiddle2.replace("[", "");
        System.out.println(rez);
    }
}
