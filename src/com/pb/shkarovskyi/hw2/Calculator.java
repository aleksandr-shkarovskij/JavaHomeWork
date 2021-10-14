package com.pb.shkarovskyi.hw2;

import java.util.Scanner;

import static java.lang.System.in;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        String sign; // = "/"; // + - * /
        int x;
        int y;

        System.out.println("Введите первое число");

        x = scan.nextInt();

        System.out.println("Введите второе число");

        y = scan.nextInt();

        System.out.println("Введите действие + - * /");

        sign = scan.next();

        switch (sign) {
            case "+":
                System.out.print(x + " + " + y + " = " + (x + y));
                break;
            case "-":
                System.out.print(x + " - " + y + " = " + (x - y));
                break;
            case "*":
                System.out.print(x + " * " + y + " = " + (x * y));
                break;
            case "/":
                if (y == 0)
                    System.out.println("На 0 делить нельзя, попробуйте заново");
                if (y != 0)
                    System.out.print(x + " / " + y + " = " + (x / y));
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }
}
