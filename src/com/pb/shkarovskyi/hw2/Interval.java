package com.pb.shkarovskyi.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y;

        System.out.println("Введите число в диапазоне 0-100");

        y = scan.nextInt();

        if (y < 0) {
            System.out.print("Вне диапазона");
        } else if (y <= 14) {
            System.out.print("Ваш диапазон 0 -14!");
        } else if (y <= 35) {
            System.out.print("Ваш диапазон 15 - 35!");
        } else if (y <= 50) {
            System.out.print("Ваш диапазон 36 - 50!");
        } else if (y <= 100) {
            System.out.print("Ваш диапазон 51 - 100");
        } else {
            System.out.print("Вне диапазона");
        }
    }
}
