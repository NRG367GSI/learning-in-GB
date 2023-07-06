package Homework_4;

import java.util.LinkedList;

public class Task_2 {

    public static void reverse(int size) {
        LinkedList<Integer> arrNum = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            arrNum.add(i);
        }
        System.out.println(arrNum);
        for (int i = 0; i < size; i++) {
            arrNum.add(i, arrNum.getLast());
            arrNum.removeLast();
        }
        System.out.println(arrNum);
    }
}
