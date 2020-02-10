package arrays;

public class Arrays2 {
    //Задан массив из 10-ти элементов, посчитать сумму каждого 2го элемента

    public static void main(String[] args) {
        int[] arrayInit = {32, 140, 1, 0, 5, 2, 56, 77, 11, 8};
int sum = 0;
        for (int i = 1; i < arrayInit.length; i += 2) {
sum += arrayInit[i];
        }

        System.out.println("Сумма каждого второго элемента = " + sum);
    }
}
