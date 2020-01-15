package task1;

public class Lesson2 {
    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 1;

        short s1 = 2;
        short s2 = 2;

        int i1 = 3;
        int i2 = 3;

        byte b = (byte) (b1 + b2); //приведение типов

        double pi = 3.14;

        int pi2 = (int) pi;

        System.out.println(pi2);

        boolean bool;
        int number1 = 1;
        int number2 = 2;

        bool = number1 < number2;
        System.out.println(bool);

        boolean bool2 = number1 == number2;
        System.out.println("Результат сравнения  1 и 2: " + bool2);

        System.out.println(50.5%10);

        boolean logic1 = true;
        boolean logic2 = false;
        boolean logic = logic1 || logic2;
        System.out.println(logic);

        int number4 = 25;
        if (number4 % 2 == 0) {                                 //проверка четное число или нет
            System.out.println("Число " + number4 + " четное!");
        }
        else {
            System.out.println("Число " + number4 + " не четное!");
        }
    }
}
