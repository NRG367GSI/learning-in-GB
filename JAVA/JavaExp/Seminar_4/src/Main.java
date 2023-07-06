import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args) {

        pars(getString());
        pars(getString());
        pars(getString());

    }

    //"text"~"num"
    static String getString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.next();

        return str;
    }

    static void pars(String str) {
        //StringBuilder nesStr = new StringBuilder();
        //str.replaceAll("\"", "");
        str = str.replace("\"", "");
        String[] arr = str.split("~");
        if (arr[0].equals("print")) {
            System.out.println(list.get(Integer.parseInt(arr[1])));
        }else if (arr[0].equals("remove")) {
            list.remove(Integer.parseInt(arr[1]));
        } else list.add(Integer.parseInt(arr[1]), arr[0]);
        System.out.println(list);
    }

}
