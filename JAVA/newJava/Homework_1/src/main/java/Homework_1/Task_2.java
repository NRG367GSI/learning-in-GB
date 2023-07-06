package Homework_1;

import java.util.Scanner;

// 2. Написать метод, который определяет, является ли введенный пользователем год високосным,
//и возвращает в консоль boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.
public class Task_2 {
    public static boolean leapJear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int jear = sc.nextInt();
        if (jear%400 == 0) {
            return true;
        } else if (jear%100 == 0) {
            return false;
        } else if (jear%4 == 0) {
            return true;
        }
        return false;
    }

    public static void output() {

        System.out.println(leapJear());
        System.out.print("\n");
    }
}
