package exp;

import java.io.*;
import java.util.*;


/*
1. Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.

2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class XxpTask_1 {

    public Deque<String> sequence = new ArrayDeque<>();
    public int num;


    public static void menu() {
        Scanner scan = new Scanner(System.in);
        String[] list = {"print", "revert", "add", "exit"};
        ArrayList<String> arrayList = new ArrayList<String>(List.of(list));

        String args = null;
        while (arrayList.lastIndexOf(args) == -1) {
            System.out.println("Make a request, pleas: ");
            args = scan.nextLine().toLowerCase();
            switch (args) {
                case "print":
                    outConsole();
                    break;
                case "revert":
                    System.out.println("revert");
                    break;
                case "add":
                    try {
                        //saveStr();
                        //readFile();
                    } catch (Exception e) {
                        System.out.println("Произошла ошибка при дабовлении!");
                    }

                    //System.out.println(sequence);
                    menu();
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        }
    }

    public static Deque<String> addStr(String str) {

        //Deque<String> seq = new ArrayDeque<String>(sequence);

        if (seq.offerLast(str)) {
            System.out.println("Выражение успешно добавлен!" + str);
        } else {
            System.out.println("Выражение не добавлен!");
        }
        return seq;
    }

    public static void saveStr() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        dataSave(line);

    }

    public static void dataSave(String text) {

        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("save.txt", true))); // true добавит новые данные
            out.println(text);
            System.out.println("Запись прошла успешно!");
            out.close();
        } catch (IOException e) {
            System.out.printf("Произошла ошибка: %t", e);
        }
    }

    public static void readFile() {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
            while ((line = br.readLine()) != null) {
                addStr(line);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            System.out.println("Произошла ошибка: " + e);

        }
    }

    public static void outConsole() {
        //ArrayList<String> line = new ArrayList<>(sequence);
        for (int i = 0; i < line.size(); i++) {

            System.out.println(line.get(i));
        }


    }


}
