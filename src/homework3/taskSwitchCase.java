package homework3;

import java.io.BufferedReader;
import java.util.Scanner;

public class taskSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String weekDay = scanner.nextLine();

        switch (weekDay) {
            case "понедельник":
                System.out.println("номер дня недели " + 1);
                break;
            case "вторник":
                System.out.println("номер дня недели " + 2);
                break;
            case "среда":
                System.out.println("номер дня недели " + 3);
                break;
            case "четверг":
                System.out.println("номер дня недели " + 4);
                break;
            case "пятница":
                System.out.println("номер дня недели " + 5);
                break;
            case "суббота":
                System.out.println("номер дня недели " + 6);
                break;
            case "восресенье":
                System.out.println("номер дня недели " + 7);
                break;
            default:
                System.out.println("такого дня недели не существует");

        }
    }
}
