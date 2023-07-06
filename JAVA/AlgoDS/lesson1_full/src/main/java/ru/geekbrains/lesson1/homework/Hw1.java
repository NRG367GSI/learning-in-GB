package ru.geekbrains.lesson1.homework;

import java.util.Random;

public class Hw1 {
    public static void main(String[] args) {
        int[] seq = arr(1_000_000, 0, 1000);
        arrOutput(seq);
        System.out.println("\n");


        sort(seq);

        arrOutput(seq);
        System.out.println("\n");

    }

    public static int[] arr(int size, int randomMin, int randomMax) {
        Random number = new Random();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = number.nextInt(randomMin, randomMax);
        }

        return list;
    }

    public static void arrOutput(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d   ", i);

        }
    }

    public static void sort(int arr[])
    {
        int n = arr.length;

        for (int i = (n / 2) - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}