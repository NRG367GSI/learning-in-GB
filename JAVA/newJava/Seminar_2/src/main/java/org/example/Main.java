package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("");

    }

//    public static void concatMethod1 () {
//        char a = charInput("Введите первый символ: ");
//        char b = charInput("Введите второй символ: ");
//        int strSize = userInput("Введите размер строки: ");
//
//        StringBuilder sb = new StringBuilder();
//        int counter = 0;
//        while (counter < strSize) {
//            sb.append(a);
//            counter++;
//            if (counter < strSize)
//                private static int userInput(String msg) {
//                Scanner sc = new Scanner(System.in);
//                int inputStr;
//                while (true) {
//                    System.out.print(msg);
//                    try {
//                        inputStr = Integer.parseInt(sc.next());
//                        break;
//                    } catch (NumberFormatException e) {
//                        System.out.println("Неверный ввод! Введите целое число!");
//                    }
//                }
//                return inputStr;
//            }
//
//            private static char charInput(String msg) {
//                Scanner sc = new Scanner(System.in);
//                char inputChar;
//                while (true) {
//                    System.out.print(msg);
//                    try {
//                        inputChar = sc.next().charAt(0);
//                        break;
//                    } catch (NumberFormatException e) {
//                        System.out.println("Неверный ввод! Введите целое число!");
//                    }
//                }
//                return inputChar;
//            }
//
//        }
//
//        public static void concatMethod2 () {
//            char a = charInput("Введите первый символ: ");
//            char b = charInput("Введите второй символ: ");
//            int strSize = userInput("Введите размер строки: ");
//
//            StringBuilder sb = new StringBuilder();
//            int counter = 0;
//            while (counter < strSize-1) {
//                sb.append(a);
//                sb.append(b);
//                counter++;
//            }
//            if (counter%2!=0){
//                sb.delete(counter-2, counter-1);
//            }
//            System.out.println(sb);
}
