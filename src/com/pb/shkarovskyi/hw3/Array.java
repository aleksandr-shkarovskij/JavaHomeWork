package com.pb.shkarovskyi.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

        public static void main(String[] args) {

            int[] array = new int[10];
            int sum = 0;
            int pos = 0;
            boolean isSorted = false;
            int buf;
            Scanner scan = new Scanner(System.in);

            System.out.println("Введите одномерный массив целых чисел размерностью 10 элементов!");

            for (int i = 0; i < 10; i++) {

                System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
                array[i] = scan.nextInt();
            }

            System.out.println("Ваш введенный массив чисел: ");
            System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Сумма чисел данного массива = " + sum);

            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    pos++;
                }
            }
            System.out.println("Количество положительных чисел массива: " + pos);

            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length-1; i++) {
                    if(array[i] > array[i+1]){
                        isSorted = false;

                        buf = array[i];
                        array[i] = array[i+1];
                        array[i+1] = buf;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
}