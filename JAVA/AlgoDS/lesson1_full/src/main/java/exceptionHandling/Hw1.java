package exceptionHandling;

import java.util.Random;

public class Hw1 {
    public static void main(String[] args) {
        int[] firstArr = createArr();
        int[] secondArr = createArr();
        printArr(firstArr);
        printArr(secondArr);
        int[] dif = sequenceDifference(firstArr, secondArr);
        printArr(dif);
        int[] divide = divideArrays(firstArr, secondArr);
        printArr(divide);
    }

    public static int[] createArr() {
        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(1,10)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0,10);
        }
        return arr;
    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
     * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не
     * равны, необходимо как-то оповестить пользователя.
     * @param firstArr
     * @param secondArr
     * @return
     */
    public static int[] sequenceDifference(int[] firstArr, int[] secondArr) {
        int[] resultArr = new int[0];
        try {
            if (firstArr.length != secondArr.length) {
                throw new IllegalArgumentException("Размеры последовательностей разные!");
            } else {
                resultArr = new int[firstArr.length];
                for (int i = 0; i < resultArr.length; i++) {
                    resultArr[i] = firstArr[i] - secondArr[i];
                }
            }
        } catch (IllegalArgumentException re) {
            re.getMessage();
        }

        return resultArr;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
     * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не
     * равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое
     * пользователь может увидеть
     * @param firstArr
     * @param secondArr
     * @return
     */
    public static int[] divideArrays(int[] firstArr, int[] secondArr) {
        int[] result = new int[0];
        try {
            if (firstArr.length != secondArr.length) {
                throw new IllegalArgumentException("Размеры последовательностей разные!");
            }
            result = new int[firstArr.length];
            for (int i = 0; i < firstArr.length; i++) {
                if (secondArr[i] == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                result[i] = firstArr[i] / secondArr[i];
                }
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
