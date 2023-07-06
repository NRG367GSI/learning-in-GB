package Homework_5;

import java.util.Scanner;

public class maze {

    static int[][] map = new int[][] {
            { 00, 00, 00, 00, 00, 00, 00, 00 },
            { 00, 00, -1, 00, 00, 00, 00, 00 },
            { 00, 00, -1, 00, -1, 00, -1, 00 },
            { 00, 00, -1, 00, 00, 00, -1, 00 },
            { 00, 00, -1, 00, 00, 00, -1, 00 },
            { 00, -1, -1, -1, -1, -1, -1, 00 },
            { 00, 00, -1, 00, 00, 00, -1, 00 },
            { 00, 00, -1, 00, 00, 00, -1, 00 },
            { 00, 00, 00, 00, 00, 00, -1, 00 },
            { 00, 00, 00, 00, 00, 00, -1, 00 },
            { 00, 00, 00, 00, 00, 00, 00, 00 }

    };

    int START = 1;
    int EXIT = -2;

    public  static void outMap() {
        for (int[] arr : map) {
            for (int element: arr) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }
    }

    public static void moving() {
        Scanner scanner = new Scanner(System.in);
        String columns  = scanner.next();
        String row = scanner.next();
        int character = 1;
        int i = 1;
        int j = 0;
        map[i][j] = 1;
        outMap();
        switch (move)


        System.out.printf("%2d, %2d, %2d", map[0][0], map[0][1], map[1][0]);


    }
}
