package Homework_4;

import java.util.*;

public class Task_1 {

    static ArrayList<String> arrayList = new ArrayList<>();

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        String[] list = {"print", "revert", "add", "exit"};
        ArrayList<String> arrayList = new ArrayList<String>(List.of(list));

        String args = null;
        while (arrayList.lastIndexOf(args) == -1) {
            System.out.println("________________________________________________________________________________________" + "\n" +
                                "Ввндите интерисующий команду Меню:" + "\n" +
                                "add - Добавление" + "\n" +
                                "print - Вывод в консоль" + "\n" +
                                "revert - удаление пред идущей строки" + "\n" +
                                "exit - выход" + "\n" +
                                "_______________________________________________________________________________________" +
                                "\n");
            args = scan.nextLine().toLowerCase();
            switch (args) {
                case "print":
                    printing();
                    System.out.println("Нажмитн Enter, для продолжения: ");
                    scan.nextLine();
                    menu();
                    break;
                case "revert":
                    revert();
                    System.out.println("Нажмитн Enter, для продолжения: ");
                    scan.nextLine();
                    menu();
                    break;
                case "add":
                    addLine();
                    System.out.println("Нажмитн Enter, для продолжения: ");
                    scan.nextLine();
                    menu();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + args);
            }
        }
    }

    public  static void addLine() {
        String str = scanTerminal();
        arrayList.add(str);
        System.out.printf("Секщка %s, добавлена!", str);
    }

    public  static String scanTerminal() {
        Scanner scan = new Scanner(System.in);
        System.out.println(("Введите текст: "));
        String str = scan.nextLine();
        return str;
    }

    public  static void printing() {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void revert() {
        ArrayDeque<String> deque = new ArrayDeque<>(arrayList);
        String str = deque.removeLast();
        System.out.printf("Элемент списка %s, удален из конца очереди! ", str);
        addLine();
    }
}
