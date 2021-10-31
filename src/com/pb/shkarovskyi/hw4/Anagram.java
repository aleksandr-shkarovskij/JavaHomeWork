package com.pb.shkarovskyi.hw4;

import java.util.Scanner;

public class Anagram {

    static boolean work(String s1, String s2) {

        boolean result;

        char[] chArr1 = s1.toLowerCase().toCharArray();
        char[] chArr2 = s2.toLowerCase().toCharArray();

        for (int i = chArr1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (chArr1[j] > chArr1[j + 1]) {
                    char tmp = chArr1[j];
                    chArr1[j] = chArr1[j + 1];
                    chArr1[j + 1] = tmp;
                }
            }
        }

        for (int i = chArr2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (chArr2[j] > chArr2[j + 1]) {
                    char tmp = chArr2[j];
                    chArr2[j] = chArr2[j + 1];
                    chArr2[j + 1] = tmp;
                }
            }
        }

        String valueOfchar1 = String.valueOf(chArr1);
        String valueOfchar2 = String.valueOf(chArr2);
        valueOfchar1 = valueOfchar1.replaceAll(" ", "");
        valueOfchar2 = valueOfchar2.replaceAll(" ", "");
        System.out.println(valueOfchar1);
        System.out.println(valueOfchar2);

        result = valueOfchar1.equalsIgnoreCase(valueOfchar2);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1, s2;

        System.out.println("Введите предложение №1");
        s1 = sc.nextLine().replaceAll("(?U)[\\pP\\s]", "");
        System.out.println("Введите предложение №2");
        s2 = sc.nextLine().replaceAll("(?U)[\\pP\\s]", "");

        System.out.println(work(s1, s2));

    }
}