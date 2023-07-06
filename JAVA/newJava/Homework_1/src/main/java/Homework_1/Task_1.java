package Homework_1;

import java.util.Random;
import java.util.Scanner;

// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class Task_1 {
    // Получаем массив задаваймого размера случайных целочисленных значений, в задаваймых приделах
    public static int[] getIntArr(int size, int min, int max) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(min, max);
        }
        return arr;
    }

    // Находим минимальное и максимальное значение массива целочисленных значений
    public  static void minMaxArr(int[] arr) {
        int min = 0;
        int max = 0;
        for (int items:arr) {
            min = (min > items) ? items : min;
            max = (max < items) ? items : max;

        }
        System.out.printf("min = %d, max = %d + \n", min, max);
    }

    // Получение параметров массива, контроллер
    public static void controller() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Введите минимальное значение массива: ");
        int min = scan.nextInt();
        System.out.println("Введите максимальное значение массива: ");
        int max = scan.nextInt();
        minMaxArr(getIntArr(size, min, max));
    }


}
