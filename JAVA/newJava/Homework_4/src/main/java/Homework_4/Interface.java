package Homework_4;

import java.util.Scanner;

public class Interface {
    public  static void menuStart() {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("___________________________________________________________________________________" + "\n" +
                "Ввндите интерисующий пункт Меню:" + "\n" +
                "1 - Задача 1" + "\n" +
                "2 - задача2" + "\n" +
                "0 - выход" + "\n" +
                "________________________________________________________________________________________" +
                "\n");
        String menu = scan.next();
        while (menu != "0" && menu != "1" && menu != "2") {
            switch (menu) {
                case "1":
                    Task_1.menu();
                    System.out.println("Нажмитн Enter, для продолжения: ");
                    scan2.nextLine();
                    menuStart();
                    break;
                case "2":
                    Task_2.reverse(10);
                    System.out.println("Нажмитн Enter, для продолжения: ");
                    scan2.nextLine();
                    menuStart();
                    break;
                case "0":
                    System.exit(0);
                    break;
            }
        }
    }


}
