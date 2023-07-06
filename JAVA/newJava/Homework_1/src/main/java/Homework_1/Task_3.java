package Homework_1;

import java.util.Scanner;

// 3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class Task_3 {

    public  static void moving(int[] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элемен, который должен быть перемещен в конец массива: ");
        int val = scan.nextInt();
        outArr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                for (int j = arr.length - 1; j > 0; j--) {
                    if (arr[j] != val) {
                        arr[i] = arr[j];
                        arr[j] = val;
                        break;
                    } else if (j <= i) {
                        break;
                    }
                }
            }
        }
        outArr(arr);
    }

    public static void outArr(int[] arr) {
        for (int element:arr) {
            System.out.printf("%d, ", element);
        }
        System.out.println("\n" + "___________________________________________________________________________" + "\n");
    }

    public static int[] inputParamConsole(){
        int size, min, max, element;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        size = scan.nextInt();
        System.out.println("Введите минимальное значение массива: ");
        min = scan.nextInt();
        System.out.println("Введите максимальное значение массива: ");
        max = scan.nextInt();
        int[] arr = Task_1.getIntArr(size, min, max);
        return arr;
    }

    public static void controlTask_3() {
        int[] arr = inputParamConsole();
        moving(arr);
    }
}
