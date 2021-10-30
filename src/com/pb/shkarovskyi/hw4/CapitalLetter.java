package com.pb.shkarovskyi.hw4;

import java.util.Scanner;

public class CapitalLetter {


    public static String capLet(String s) {
        char[] result = s.toCharArray();
        if(Character.isAlphabetic(result[0]))result[0]=Character.toUpperCase(result[0]);
        String res=""+result[0];
        for(int i=1;i<result.length;i++) {
            if(Character.isAlphabetic(result[i]) && !Character.isAlphabetic(result[i-1]))result[i]=Character.toUpperCase(result[i]);
            res+=result[i];
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner inScan = new Scanner(System.in);

        System.out.println("Введите предложение:");

        String s = inScan.nextLine();

        System.out.println(capLet(s));

    }

}