package Homework_2;

import java.util.Scanner;

public class Task_1 {
    private String str;

    private boolean palindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            String startStr = String.valueOf(str.charAt(i));
            String endStr = String.valueOf(str.charAt(str.length() - 1 - i));
            if (startStr.equals(endStr)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private void outPolindrome() {

        var startTime = System.currentTimeMillis();
        System.out.println(palindrome(str));
        var endTime = System.currentTimeMillis();
        System.out.printf("Время работы алгоритма без StringBuilder %d \n", (int) (endTime - startTime));

        var startTimeSB = System.currentTimeMillis();
        System.out.println(polindromeSB(str));
        var endTimeSB = System.currentTimeMillis();
        System.out.printf("Время работы алгоритма с StringBuilder %d \n", (int) (endTimeSB - startTimeSB));

    }

    private boolean polindromeSB(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length() / 2; i++) {
            String startStr = String.valueOf(sb.charAt(i));
            String endStr = String.valueOf(sb.charAt(str.length() - 1 - i));
            if (startStr.equals(endStr)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private String inStr() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку, что б проверить ее на полиндром: \n");
        String str = scan.next();
        return str;
    }

    public static void controller() {
        String str = "asdfghjklkjhgfdsa";
        Task_1 exp = new Task_1();
        exp.str = str;
        exp.outPolindrome();
        Task_1 consoleIn = new Task_1();
        consoleIn.str = consoleIn.inStr();
        consoleIn.outPolindrome();
    }
}
