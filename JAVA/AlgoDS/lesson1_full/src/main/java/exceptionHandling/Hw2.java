package exceptionHandling;
import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) throws Exception {
        // task1
        getFloat();

        task2();

        task3();

        task4();

    }

    private static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                return scanner.nextFloat();
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Пожалуйста, повторите попытку.");
                scanner.nextLine();
            }
        }
    }
    public static void task2(){
        try {
            int d = 0;
            double catchedRes1 = 8 / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    public static void task3() throws Exception{
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void task4() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new Exception("Нельзя вводить пустые строки!");
        }
        System.out.println("Вы ввели: " + input);
    }




}


