package arrays;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        int[] arrayDirect = new int[10];
        int[] arrayReturn = new int[10];

        for (int i = 0; i < arrayDirect.length; i++) {
            Scanner scanner = new Scanner(System.in);
            arrayDirect[i] = scanner.nextInt();

        }

        for (int i = 0; i < arrayReturn.length; i++) {
            arrayReturn[i] = arrayDirect[arrayDirect.length - 1 - i];

            System.out.print(arrayReturn[i] + " ");
        }


    }
}
