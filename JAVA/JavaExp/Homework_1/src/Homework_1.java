import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        triangularNumber(10);
        factorial(5);
        naturalNumber();
        calc(getExpression());
        //getExpression();
    }

    static void triangularNumber(int number) {
        int points = 0;
        while (number != 0) {
            points += number;
            number -= 1;
        }
        System.out.println(points);
    }

    static void factorial(int number) {
        int points = 1;
        while (number != 0) {
            points *= number;
            number -= 1;
        }
        System.out.println(points);
    }

    static void  naturalNumber() {
        for (int i = 1 ; i < 1001; i++) {
            int index = 0;
            for (int j = 2; j < i; j++){
                if (i%j == 0) index += 1;
            }
            if (index == 0 && i != 1) System.out.println(i);
        }
    }

    static String getExpression(){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = iScanner.nextLine();
        return expression;
    }
    static void  calc(String expression) {
        double c;
        if (expression.indexOf("+") != -1) {
            double a = Double.parseDouble(expression.substring(0, expression.indexOf("+")));
            double b = Double.parseDouble(expression.substring(expression.indexOf("+") + 1, expression.length()));
            c = a + b;
        } else if (expression.indexOf("-") != -1) {
            double a = Double.parseDouble(expression.substring(0, expression.indexOf("-")));
            double b = Double.parseDouble(expression.substring(expression.indexOf("-") + 1, expression.length()));
            c = a - b;
        } else if (expression.indexOf("*") != -1) {
            double a = Double.parseDouble(expression.substring(0, expression.indexOf("*")));
            double b = Double.parseDouble(expression.substring(expression.indexOf("*") + 1, expression.length()));
            c = a * b;
        } else if (expression.indexOf("/") != -1) {
            double a = Double.parseDouble(expression.substring(0, expression.indexOf("/")));
            double b = Double.parseDouble(expression.substring(expression.indexOf("/") + 1, expression.length()));
            c = a / b;
        } else c = 99;
        System.out.println(c);
    }

}
