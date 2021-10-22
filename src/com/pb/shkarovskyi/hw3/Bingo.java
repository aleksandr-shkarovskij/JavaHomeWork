package com.pb.shkarovskyi.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int x = random.nextInt(101);

        System.out.println("SkyNET захватил контроль над людьми. Все важные объекты инфраструктуры уничтожены. ");
        System.out.println("Единственный шанс спасти человечество - отгадать число, которое загадал злостный SkyNET!");
        System.out.println("Число находится в диапазоне от 0 до 100.");
        System.out.println("");
        System.out.println("P.S. Либо введите 666 чтобы сдаться и позволить SkyNET уничтожить человечество...");
        System.out.println("");

        for (int counter = 1; counter > 0; counter++) {
            System.out.println("");
            System.out.println("Введите целое число для деактивации SkyNET:");

            int y = scan.nextInt();

            if (x == y) {
                System.out.println("Поздравляем, Вам удалось остановить SkyNET c " + counter + " попытки!");
                break;
            }

            else if (y > x && y < 101) {
                System.out.println("Вам не удалось деактивировать SkyNET, попробуйте ещё раз!");
                System.out.println("P.S. Попробуйте ввести число меньше предыдущего");
                continue;
            }

            else if (y < x && y > 0) {
                System.out.println("Вам не удалось деактивировать SkyNET, попробуйте ещё раз!");
                System.out.println("P.S. Попробуйте ввести число больше предыдущего");
                continue;
            }

            else if (y == 666) {
            System.out.println("Поздравляем! Вы не захотели остановить SkyNET и он уничтожил всё человечество...");
            System.out.println("Осталась надежда лишь на Силы Сопротивления и Джона Коннора...");
            break;
            }

            else {
                System.out.print("Число вне диапазона 0-100!");
            }
        }
    }
}
