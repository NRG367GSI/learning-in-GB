import java.io.*;

public class workingWithFiles {
    static void creationFile() {
        // Когда в качестве второго аргумента FileWriter передается true, чтобы включить режим «добавить».
        try (FileWriter fw = new FileWriter("Example.txt", false)) {
            fw.write("линия 1"); // Записывает в файл
            fw.append("line 2"); // добовляет в конец пред идущей строки
            fw.flush(); // как пишут отчищает поток
            fw.close(); // должен закрывать файл но видимо сдесь не нужно

        }catch (IOException e) {
            System.out.println(e.getMessage()); // с getMessage нужно разобраться
        }
    }
    static  void readFile() throws Exception{
        // Класс BufferedWriter записывает текст в поток,
        // предварительно буферизируя записываемые символы,
        // тем самым снижая количество обращений к физическому носителю для записи данных.
        BufferedReader br = new BufferedReader(new FileReader("Example.txt"));
        String str;
        while ((str = br.readLine()) != null) { // считывает строку из файла помещает в переменную и пока не пустая выполняет тело цикла
            //если вместо readLine будит read , будит считываться по символьно
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
