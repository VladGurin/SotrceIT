package homework4;

public class Task2While {
    public static void main(String[] args) {
        //С помощью цикла while необходимо вывести все простые числа в диапазоне от 20 до 100.
        //Просто́е число́ — это натуральное число, больше единицы, имеющее ровно два натуральных делителя: 1 и само себя.

        int i = 20;

        System.out.println("Натуральные числа в диапазоне от 20 до 100: ");
        while (i <= 100) {
            int j = 2;
            int count = 0;

            while (j < i) {
                if (i % j == 0) {
                    count += 1;
                }
                j++;
            }
            if (count == 0) {
                System.out.print(" " + i);
            }
            i++;
        }
    }
}
