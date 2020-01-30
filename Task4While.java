package homework4;

public class Task4While {
    public static void main(String[] args) {
        //Имеется кусок ткани длинной 1000 метров. От него последовательно
        // отрезаются куски 37 метров. Написать программу, которая бы “отрезала”
        // ткань и выдавала бы сообщение о том что кусок отрезан, либо сообщение о том,
        // что материала не хватает, если будет затребован кусок ткани больше длины, чем имеется.

        int fabric = 1000;
        int count = 0;
        do {
            fabric -= 37;
            if (fabric > 0){
            count +=37;
            System.out.println("It was cut the piece which has length : " + count);}
            else
                System.out.println("There are not enough fabric. ");
        }
        while (fabric > 0);


    }
}
