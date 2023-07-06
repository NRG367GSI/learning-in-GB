
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.getType;

public class Main {
    public static void main(String[] args) throws Exception {

        // использование исключений
        try {
        //System.out.println(compressor("фыывввааапппрр"));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Пустая строка");
            }
        //simpleOperation();
        // А знаете ли Вы, что возвращает .getClass()?
        //workInArr();
        //expression();
        //lineSeparator();
        //simpleFormatString(); // а есть Класс Formatter и там еще больше всего
        //month();
        //System.out.println(sum.sum());
        //cykleWhile();
        //workingWithFiles.readFile();
        workFile.file();

    }

    // метод архиватор "фыывввааапппрр" - ф1ы2в3а3п3
    static String compressor(String str) {
        StringBuilder newString = new StringBuilder();
        char symbol = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (symbol == str.charAt(i)) {
                count += 1;
            } else if (symbol != str.charAt(i)) {
                newString.append(symbol).append(count);
                symbol = str.charAt(i);
                if (i == str.length()-1) newString.append(symbol).append(count);
                count = 1;
            }
        }
        return newString.toString();
    }
// ЛЕКЦИЯ 1
    static  void simpleOperation() {
        String s = "qwer";
        s.charAt(1); // получение символа из строки по индексу
        System.out.println(Double.MAX_VALUE); // так можно узнать максимальное значение нужного типа
        System.out.println(getType(2)); // Определение типа простого элемента
        int a = 10;
        a ++; //+1
        ++a; //+1
        //a = --a-a--; // такая запись любое число привратит в ноль
        a = a << 1; // эта побитовая операция сдвигая биты удваивает число (нужно разобраться) из 12 в 24
        System.out.println(Character.isDigit(a)); // это число
    }


    // работа с массивами
    static void workInArr() {
        int[] arr = new int[10]; // задаем массив целых чисел
        System.out.println(Arrays.toString(arr)); // для вывода массива чисел нужно приобразовывать
        // в строку Arrays.toString(arr), а для массива строк String.join()
        int[] arr2 = new  int[] {1,2,3};
        int num = arr2[1]; // обращение к элементу
        arr2[2] = 10; //
        int len = arr2.length; // длина
        for (int i : arr2) System.out.printf("%d ", i); // способ получения данных позиционно
        int[][] matrix = new int[2][3];
        int[] matrix2[] = new int[3][2];
    }

    // консольный ввод
    static int expression() {
        Scanner sc = new Scanner(System.in); // System.in запрашивает консольный ввод и передает в Scanner
        System.out.println("Введите число:"); // Выводим преглошение для ввода в консоли

        // hasNextByte(), hasNextShort(), hasNextLong(), hasNextFloat(), hasNextDouble()
        if (sc.hasNextInt()) { // Класс Scanner метод проверки это число
            int number = sc.nextInt(); // присваиваем число переменной
            return number;
        } else {
            return 9999999;
        }

        //sc.close(); // сканер должен быть закрыт по завершении своей работы

    }
// Разделитель строки
    public static void lineSeparator() {
        Scanner scan = new Scanner("На голой ветке'" +
                "Ворон сидит одиноко.'" +
                "Осенний вечер." +
                "''***''" +
                "В небе такая луна,'" +
                "Словно дерево спилено под корень:'" +
                "Белеет свежий срез." +
                "''***''" +
                "Как разлилась река!'" +
                "Цапля бредет на коротких ножках,'" +
                "По колено в воде."); // передали в сканер строку

        scan.useDelimiter("'"); // указали в скобках разделитель
// с помощью вызова метода next() можно получить следующий элемент.
// С помощью метода hasNext() можно узнать, есть ли следующий элемент, и не достигнут ли конец коллекции
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close(); // сканер должен быть закрыт по завершении своей работы
    }

    // Форматирование вывода
    static void simpleFormatString() {
            String book = "book";
            String j = "java";
            int num = 8;
            String res = String.format("This %s is about %n%S %c", book, j, num);
            //System.out.print(res); // можно так и так
            System.out.printf("This %s is about %n%S %c", book, j, num); // нужно изучить спецификаторы
        }
// Тернарный оператор
    static void abs() {
        int number = 10;
        //return number >= 0 ? number : -number; //Тернарный оператор
        if (number >= 0) {
            System.out.println(number);
        }
    }

    static void month(){
        int month = 3;
        String monthString;
        switch (month) {
            case 1:  monthString = "Январь";
                break;
            case 2:  monthString = "Февраль";
                break;
            case 3:  monthString = "Март";
                break;
            case 4:  monthString = "Апрель";
                break;
            case 5:  monthString = "Май";
                break;
            case 6:  monthString = "Июнь";
                break;
            case 7:  monthString = "Июль";
                break;
            case 8:  monthString = "Август";
                break;
            case 9:  monthString = "Сентябрь";
                break;
            case 10: monthString = "Октябрь";
                break;
            case 11: monthString = "Ноябрь";
                break;
            case 12: monthString = "Декабрь";
                break;
            default: monthString = "Не знаем такого";
                break;
        }
        System.out.println(monthString); //mInfoTextView.setText видимо графический интерфейс
    }

    static void cykleWhile() {
        int countDown = 10;
        while (countDown >= 0) {
            System.out.println("До старта: " + countDown);
            countDown --;
        }
        System.out.println("Поехали !");
    }

    // цикал для массивов
    static void cykleArr() {
        String[] daysOfWeek =
                { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };
        for (String dayOfWeek : daysOfWeek) {
            System.out.println(dayOfWeek);
        }
    }
}

