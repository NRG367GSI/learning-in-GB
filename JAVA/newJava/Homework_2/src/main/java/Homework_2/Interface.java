package Homework_2;

import java.util.Scanner;

public class Interface {

    public  static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.print("___________________________________________________________________________________" + "\n" +
                            "Ввндите интерисующий пункт Меню:" + "\n" +
                            "1 - Задача 1" + "\n" +
                            "2 - задача2" + "\n" +
                            "0 - выход" + "\n" +
                            "________________________________________________________________________________________" +
                            "\n");
        String menu = scan.next();
        while (menu != "0" && menu != "1" && menu != "2" && menu != "3") {
            switch (menu) {
                case "1":
                    Task_1.controller();
                    menu();
                break;
                case "2":
                    Task_2.controller();
                    menu();
                break;
                case "0": break;
                default:
                    break;
            }
            break;
        }
    }
}
