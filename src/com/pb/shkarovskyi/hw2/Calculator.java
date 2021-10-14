package com.pb.shkarovskyi.hw2;

import java.util.Scanner;

import static java.lang.System.in;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        String sign; // = "/"; // + - * /
        int operand1;
        int operand2;

        System.out.println("Введите первое число");

        operand1 = scan.nextInt();

        System.out.println("Введите второе число");

        operand2 = scan.nextInt();

        System.out.println("Введите действие + - * /");

        sign = scan.next();

        switch (sign) {
            case "+":
                System.out.print(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                break;
            case "-":
                System.out.print(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                break;
            case "*":
                System.out.print(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0)
                    System.out.println("На 0 делить нельзя, попробуйте заново");
                if (operand2 != 0)
                    System.out.print(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }
}
