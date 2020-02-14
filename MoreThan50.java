package homework7;

public class MoreThan50 {
    public static void main(String[] args) {
//Задан массив из 10-ти элементов, содать и вывести новый массив,
// в котором бы хранились только элемены больше 50 (подсказка, сначала
// нужно посчитать сколько таких элементов, а потом создать новый массив нужного размера)

        int[] array1 = {32, 140, 1, 0, 5, 2, 56, 77, 11, 8};
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 50) {
                count++;
            }
        }

        int[] array2 = new int[count];
        int k = 0;

        for (int j = 0; j < array1.length; j++) {
            if (array1[j] > 50) {
                array2[k] = array1[j];
                k++;
            }
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Новый массив: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

    }

}
