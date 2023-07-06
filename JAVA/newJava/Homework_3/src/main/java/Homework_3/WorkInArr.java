package Homework_3;

import java.util.*;

public class WorkInArr {

    public ArrayList<Integer> arr;
    public ArrayList<Integer> evenNum;
    public int minArr;
    public int maxArr;
    public int arithmeticMean;

    public static ArrayList<Integer> CreateArr(int size, int min, int max) {
        ArrayList<Integer> arr = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr.add(random.nextInt(min, max));
        }
        return arr;
    }

    public  static ArrayList<Integer> removeEvenNum(ArrayList<Integer> arr) {
        arr.removeIf(i-> (i%2 == 0));
        return arr;
    }

    public  static  int minArr(ArrayList<Integer> arr) {
        return Collections.min(arr);
    }

    public  static  int maxArr(ArrayList<Integer> arr) {

        return Collections.max(arr);
    }

    public static void arithmeticMean(ArrayList<Integer> arr) {
        double average = arr.stream().mapToInt(args->args).average().getAsDouble();
        System.out.println("average = " + average);
    }
}
