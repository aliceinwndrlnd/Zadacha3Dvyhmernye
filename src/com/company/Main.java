package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Создаём квадратную матрицу, размер вводим с клавиатуры.
        Заполняем случайными числами в диапазоне от 0 до 50.
        И выводим на консоль(в виде матрицы).*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int size = scan.nextInt();
        int[][] array = new int[size][size];
        Random rnd = new Random();
        for (int[] row : array) {
            for (int i = 0; i < array.length; i++) {
                row[i] = rnd.nextInt(50);
            }
        }
        for (int[] row : array) {
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        /* 3)Проверить произведение элементов какой диагонали больше. */
        int mult1 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                mult1 *= array[i][j];
                break;
            }
        }
        System.out.println("Произведение элементов на главной диагонали: " + mult1);
        int mult2 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1 - i; j < array.length; j++) {
                mult2 *= array[i][j];
                break;
            }
        }
        System.out.println("Произведение элементов на побочной диагонали: " + mult2);
        System.out.println();
        if (mult1 > mult2) {
            System.out.println("Произведение элементов главной диагонали больше, чем произведение элементов побочной");
        }
        else if (mult1 < mult2) {
            System.out.println("Произведение элементов главной диагонали меньше, чем произведение элементов побочной");
        } else {
            System.out.println("Произведения элементов главной диагонали и побочной - равны");
        }
    }
}

