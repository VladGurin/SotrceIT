package homework4;

public class Task1While {
    public static void main(String[] args) {
//С помощью цикла while напишите программу определения суммы
// всех нечетных чисел в диапазоне от 1 до 20 включительно.
       int sum = 0;
       int i = 1;

       while (i <= 20) {
           if (i % 2 != 0) {
               sum += i;
           }
           i++;
       }
        System.out.println("Sum of odd numbers between 1 and 20 equals : " + sum);
    }

}
