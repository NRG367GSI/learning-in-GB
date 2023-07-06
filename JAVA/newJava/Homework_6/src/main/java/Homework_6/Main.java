package Homework_6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        menu();
    }

    public static ArrayList<Notebook> addList() {
        Notebook exsample_1 = new Notebook();
        exsample_1.id = 1;
        exsample_1.graphicsAccelerator = "Intel UHD Graphics 600";
        exsample_1.screen = "14 Full HD (1920x1080), IPS";
        exsample_1.storage = 128;
        exsample_1.manufacturer = "DEXP";
        exsample_1.processor = "Intel Celeron N4020, ядра: 2 х 1.1 ГГц";
        exsample_1.cost = 15999.0;
        exsample_1.volumeRam = 4;
        exsample_1.seriesName = "Aquilon";
        exsample_1.color = "black";

        Notebook exsample_2 = new Notebook();
        exsample_2.id = 2;
        exsample_2.manufacturer = "Irbis";
        exsample_2.seriesName = "NB283";
        exsample_2.screen = "14 HD (1366x768), IPS";
        exsample_2.processor = "Intel Celeron 3350, ядра: 2 х 1.1 ГГц";
        exsample_2.volumeRam = 4;
        exsample_2.storage = 128;
        exsample_2.graphicsAccelerator = "Intel HD Graphics 500";
        exsample_2.color = "white";
        exsample_2.cost = 15999.0;

        Notebook exsample_3 = new Notebook();
        exsample_3.id = 3;
        exsample_3.manufacturer = "ASUS VivoBook 14X";
        exsample_3.seriesName = "M1403QA-LY110";
        exsample_3.screen = "14 1920x1200, IPS";
        exsample_3.processor = "AMD Ryzen 5 5600H, ядра: 6 х 3.3 ГГц";
        exsample_3.volumeRam = 16;
        exsample_3.storage = 512;
        exsample_3.graphicsAccelerator = "AMD Radeon Vega 7";
        exsample_3.color = "grey";
        exsample_3.cost = 49999.0;

        Notebook exsample_4 = new Notebook();
        exsample_4.id = 4;
        exsample_4.manufacturer = "Honor MagicBook 15";
        exsample_4.seriesName = "BMH-WFQ9HN";
        exsample_4.screen = "Full HD (1920x1080), IPS";
        exsample_4.processor = "AMD Ryzen 5 5500U, ядра: 6 х 2.1 ГГц";
        exsample_4.volumeRam = 16;
        exsample_4.storage = 512;
        exsample_4.graphicsAccelerator = "AMD Radeon Graphics";
        exsample_4.color = "black";
        exsample_4.cost = 49999.0;

        Notebook exsample_5 = new Notebook();
        exsample_5.id = 5;
        exsample_5.manufacturer = "MSI Modern 14";
        exsample_5.seriesName = "C12M-229RU";
        exsample_5.screen = "Full HD (1920x1080), IPS";
        exsample_5.processor = "Intel Core i5-1235U, ядра: 2 + 8";
        exsample_5.volumeRam = 16;
        exsample_5.storage = 512;
        exsample_5.graphicsAccelerator = "Intel Iris Xe Graphics";
        exsample_5.color = "gray";
        exsample_5.cost = 50999.0;
        ArrayList<Notebook> list = new ArrayList<>();
        list.add(exsample_1);
        list.add(exsample_2);
        list.add(exsample_3);
        list.add(exsample_4);
        list.add(exsample_5);
        return list;
    }

    public static void filterRam(ArrayList<Notebook> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the minimum RAM value: ");
        int minRam = scanner.nextInt();
        System.out.println("enter the maximum RAM value: ");
        int maxRam = scanner.nextInt();
        for (Notebook element : list) {
            if ((minRam < element.volumeRam) && element.volumeRam < maxRam) {
                System.out.println(element);
            }
        }
    }
    public static void filterStorage(ArrayList<Notebook> list) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter the minimum Storage value: ");
        int minStorage = scanner2.nextInt();
        System.out.println("enter the maximum Storage value: ");
        int maxStorage = scanner2.nextInt();
        for (Notebook element : list) {
            if ((minStorage < element.storage) && element.storage < maxStorage) {
                System.out.println(element);
            }
        }
    }

    public static void filterColor(ArrayList<Notebook> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, интересующею вас цвет" + "\n" +
                                                "1 - white" + "\n" +
                                                "2 - black" + "\n" +
                                                "3 - gray" + "\n");
        int point = scanner.nextInt();
        switch (point) {
            case 1:
                for (Notebook element : list) {
                    if (element.color == "white") {
                        System.out.println(element);
                    }
                }
                break;
            case 2:
                for (Notebook element : list) {
                    if (element.color == "black") {
                        System.out.println(element);
                    }
                }
                break;
            case 3:
                for (Notebook element : list) {
                    if (element.color == "gray") {
                        System.out.println(element);
                    }
                }
                break;
        }

    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фильтр:" + "\n" +
                "1 - Объем ОЗУ" + "\n" +
                "2 - Объем накопителя" + "\n" +
                "3 - Цвет" + "\n");
        int point = scanner.nextInt();
        switch (point) {
            case 1 -> filterRam(addList());
            case 2 -> filterStorage(addList());
            case 3 -> filterColor(addList());
        }
    }
}