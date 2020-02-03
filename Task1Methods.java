package arifmetic;

import java.util.Scanner;

public class Task1Methods {
    public static void main(String[] args) {
//Написать программу, которая бы запрашивала у пользователя ввести два целых числа, и выводила бы большее из них.
        int a = readInt();
        int b = readInt();
        System.out.println("Большее число : " + compare(a, b));

    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

    public static int compare(int a, int b) {
        if (a >= b) {
            return a;
        } else return b;
    }
}