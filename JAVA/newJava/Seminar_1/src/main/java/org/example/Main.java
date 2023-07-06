package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Name();
        maxOccurs(getArrBinary(100));
    }
    public static void Name() {
        Scanner sp = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = sp.next();
        System.out.printf("Hello %s!", name);
    }

    public static int getBinaryNumber() {
        int num;
        double rnd = (double) Math.random() * 10;
        if (rnd > 5) num = 1;
        else num = 0;
        return num;
    }

    public static int[] getArrBinary(int size){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getBinaryNumber();
        }
        return arr;
    }

    public static void outIntArr(int[] arr){
        for(int num: arr){
            System.out.printf("%d, ", num);
        }
    }

    public static void maxOccurs(int[] arr){
        int count = 0;
        int max = 0;
        int size = 0;
        for (int items: arr){
            size++;
            if (items == 1) {
                count++;
            } else if (items == 0 || size == arr.length) {
                if (count > max) {
                    max = count;
                    count =0;
            }
            }
        }
        outIntArr(arr);

        System.out.printf("\n" + "%d максимум раз встречается последовательно число 1 в массиве ", max);
    }
}