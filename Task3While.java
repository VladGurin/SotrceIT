package homework4;

import java.util.Scanner;

public class Task3While {
    public static void main(String[] args) {
        //С помощью цикла while необходимо вывести  все точные квадраты натуральных чисел,
        // не превосходящие данного числа n (Пример: входные данные n = 15,
        // выходные данные (1, 4, 9) – потому что 4^2 уже будет больше 15).

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;

        while ((i <= n) && (Math.pow(i, 2) < n)) {
            System.out.println(Math.pow(i, 2));
            i++;
        }

    }
}
