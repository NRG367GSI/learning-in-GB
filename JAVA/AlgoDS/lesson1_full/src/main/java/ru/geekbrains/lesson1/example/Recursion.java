package ru.geekbrains.lesson1.example;

import java.util.Arrays;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 6, 7, 15,14,13,12,11,10,9,8,7,6,5,4,3,2,1 };
        sort(arr);
        for (int i : arr )


            System.out.println(i);

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







