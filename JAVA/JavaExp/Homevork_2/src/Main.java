import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        //workLists();
        //Ex002_fileSystemDemo();
        //Ex001_stringsDemo();
        //Ex003_throwDemo();
        Ex004_FileWriter_class();
    }

    public static void workLists() {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");
        System.out.println(states);
        for (Map.Entry<Integer, String> item : states.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
    }
    public static void Ex001_stringsDemo() {
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
    }
    public static void Ex002_fileSystemDemo() {
        String pathProject = System.getProperty("user.dir"); // Получаем Текущий рабочий каталог пользователя по ключу из списка системных свойств
        //System.out.println(pathProject); // выводим Текущий рабочий каталог пользователя в консоль

        //Properties p = System.getProperties(); // Получаем список набора ключей, имеющихся в таблице системных свойств
        //p.list(System.out); //list итерирует список из переменной p и напрвляет в поток вывода класса system

        String pathFile = pathProject.concat("/file.txt"); // добовляем к обсалютному адресу имя файла для получения полного адреса файла

        File f3 = new File(pathFile); // оздаем объект файл при помощи конструктора и передаем свойство - абсолютный адрес , но пока не создаем файл
        //System.out.println(f3.getAbsolutePath()); // выводим в консоль абсолютный путь для пути, переданного в конструктор объекта

        File f1 = new File("file.txt"); // создаём объект по имени, будит использоваться оабочий каталог
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt"); // по обсалютному адресу
        //System.out.println(f1.getAbsolutePath());
        //System.out.println(f2.getAbsolutePath());

        // создаем объекты для файлов, которые находятся в каталоге
        // присваиваем переменной абсолютный адрес, собранный из адреса каталога и имени переданными в виде аргументов
        File file1 = new File(pathProject, "fi.txt"); // теперь над объектом можно манепулировать создать например
        //System.out.println(file1);
        try {
            //boolean createNewFile(): создает новый файл по пути, который передан в конструктор.
            // В случае удачного создания возвращает true, иначе false
            boolean a = f3.createNewFile(); // обязательно внутри блока исключений
            System.out.println(a);
        } catch (Exception ex) {
            ex.printStackTrace();
            //System.out.println(ex); // В переменную ex ни чего не было передано
            System.out.println("Файл существует");
        }


    }

    public static void Ex003_throwDemo(){
        try {
            throw new NullPointerException(); // инициируем исключение
        }
        catch (NullPointerException e) { // отлавливаем исключение
            System.out.println(e); // получаеи вывод в консоль java.lang.NullPointerException
        }

        try {
            throw new IOException(); // инициируем другое исключение
        }
        catch (IOException e) { // отлавливаем исключение
                                //printStackTrace() помогает программисту понять, где возникла настоящая проблема.
                                // Метод printStackTrace() является членом класса Throwable в пакете java.lang.
            e.printStackTrace();
                                // получаеи вывод в консоль
                                    //java.io.IOException
                                    //	at Main.Ex003_throwDemo(Main.java:78)
                                    //	at Main.main(Main.java:11)
        }
        System.exit(0);
    }

    public  static void Ex004_FileWriter_class() throws IOException {
        File file = new File("Example.txt");

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);

        // Запись содержимого в файл
        writer.write("Это простой пример,\n в котором мы осуществляем\n с помощью языка Java\n запись в файл\n и чтение из файла\n");
        writer.flush();
        writer.close();

        // Создание объекта FileReader
        FileReader fr = new FileReader(file);
        char [] a = new char[200];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив

        //for(char c : a)
        System.out.print(Arrays.toString(a));   // Вывод символов один за другими
        //String arrayToString = Arrays.stream(a).collect(Collectors.joining());

        //System.out.println(arrayToString);

        fr.close();
    }
    public static void Ex005() {

    }

}
// 1 работа со строками
//2 работа с файлами
//3 исключения
// чтение запись файла