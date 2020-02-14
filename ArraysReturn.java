package homework7;

import java.util.Scanner;

public class ArraysReturn {
    public static void main(String[] args) {
        //Задан массив из 10-ти элементов,
        // создать и вывести новый массив, в котором элементы находились
        // бы в реверсе (наоборот). Например для массива:

        int[] arrayDirect = new int[10];
        int[] arrayReturn = new int[10];

        for (int i = 0; i < arrayDirect.length; i++) {
            arrayDirect[i] = inputNumber();
        }

        for (int i = 0; i < arrayReturn.length; i++) {
            arrayReturn[i] = arrayDirect[arrayDirect.length-1-i];
        }
        System.out.print("Исходный массив: " );
        for (int i = 0; i < arrayDirect.length; i++) {
            System.out.print(arrayDirect[i] + " ");
        }
        System.out.println();

        System.out.print("Обратный массив: " );
        for (int i = 0; i < arrayReturn.length; i++) {
            System.out.print(arrayReturn[i] + " ");
        }
        System.out.println();



    }
    public static int inputNumber () {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
