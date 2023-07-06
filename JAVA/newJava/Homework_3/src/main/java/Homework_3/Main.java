package Homework_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Task_1
        WorkInArr sequence = new WorkInArr();
        sequence.arr = WorkInArr.CreateArr(5,0,10);
        System.out.println(sequence.arr);

        sequence.evenNum = WorkInArr.removeEvenNum(sequence.arr);
        System.out.println(sequence.evenNum);

        // Task_2
        WorkInArr seq = new WorkInArr();
        seq.arr = WorkInArr.CreateArr(10,0,10);
        System.out.println(seq.arr);

        seq.minArr = WorkInArr.minArr(seq.arr);
        System.out.printf("min = %d \n", seq.minArr);

        seq.maxArr = WorkInArr.maxArr(seq.arr);
        System.out.printf("max = %d \n", seq.maxArr);

        WorkInArr.arithmeticMean(sequence.arr);
    }
}




