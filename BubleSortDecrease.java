package homework7;

public class BubleSortDecrease {
    public static void main(String[] args) {
        //Задан массив из 10-ти элементов, отсортировать его по убыванию
        // методом пузырьковой сортировки.
        int[] array1 = {32, 140, 1, 0, 5, 2, 56, 77, 11, 8};
        int k = 0;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        for (int j = 0; j < array1.length - 1; j++) {

            for (int i = array1.length-1; i > j; i--) {
                if (array1[i] > array1[i - 1]) {
                    k = array1[i];
                    array1[i] = array1[i - 1];
                    array1[i - 1] = k;
                }
            }
        }
        System.out.println();
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }


    }
}
