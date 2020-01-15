package Homework2;

public class binaryEqualization {
    public static void main(String[] args) {


        // Написать программу для решения квадратного уравнения
// В три переменные a, b и c записаны три вещественных числа. Создать программу,
// которая будет находить и выводить на экран вещественные корни квадратного
// уравнения ax²+bx+c=0, либо сообщать, что корней нет.
        // D = b*b - 4ac;


        double x1;
        double x2;
        double a = 1;
        double b = 5;
        double c = 3;
        double D = b * b - 4 * a * c;

        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Кореней два: ");
            System.out.println(x1);
            System.out.println(x2);
        } else if (D == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Корень один: ");
            System.out.println(x1);
        } else {
            System.out.println("Корней нет! ");
        }
    }
}