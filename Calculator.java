package arifmetic;

import java.util.Scanner;

//import static demo.Methods.*;

public class Calculator {

        public static void main(String[] args) {
            double a = readNumber();
            String operation = readOperation();
            double b = readNumber();

            double result = 0;

            switch (operation) {
                case "+":
                    result = add(a, b);
                    break;
                case "-":
                    result = subtract(a, b);
                    break;
                case "*":
                    result = multiply(a, b);
                    break;
                case "/":
                    result = divide(a, b);
                    break;
            }

            System.out.println(result);
        }

        public static double readNumber() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число");
            return sc.nextDouble();
        }

        public static String readOperation() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите операцию +, -, *, /");
            return sc.next();
        }

        public static double add(double number1, double number2) {
            return number1 + number2;
        }

        public static double subtract(double number1, double number2) {
            return number1 - number2;
        }

        public static double multiply(double number1, double number2) {
            return number1 * number2;
        }

        public static double divide(double number1, double number2) {
            return (double) Math.round((number1 / number2) * 100) / 100;
            //Проверить на 0
        }

}
