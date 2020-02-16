package homework89;

import java.util.Scanner;

public class CarsArray {
    public static void main(String[] args) {
        CarClass[] carShop = new CarClass[5];

        for (int i = 0; i < carShop.length; i++) {
            carShop[i] = new CarClass();
        }

//        CarClass car1 = new CarClass("Audi", "red", 3.0, 2015);
//        CarClass car2 = new CarClass("KIA", "blue", 2.2, 2017);
//        CarClass car3 = new CarClass("Toyota", "white", 2.0, 2019);
//        CarClass car4 = new CarClass("Acura", "red", 2.5, 2010);
//        CarClass car3 = new CarClass("Ford", "white", 5.0, 2000);

        carShop[0].setModel("Audi");
        carShop[0].setColor("red");
        carShop[0].setCapacityEngine(2.2);
        carShop[0].setYearProduction(2017);

        carShop[1].setModel("KIA");
        carShop[1].setColor("blue");
        carShop[1].setCapacityEngine(2.0);
        carShop[1].setYearProduction(2010);

        carShop[2].setModel("Toyota");
        carShop[2].setColor("red");
        carShop[2].setCapacityEngine(4.0);
        carShop[2].setYearProduction(2009);

        carShop[3].setModel("Acura");
        carShop[3].setColor("white");
        carShop[3].setCapacityEngine(1.0);
        carShop[3].setYearProduction(2019);

        carShop[4].setModel("Ford");
        carShop[4].setColor("black");
        carShop[4].setCapacityEngine(6.0);
        carShop[4].setYearProduction(2000);


//        for (int i = 0; i < carShop.length; i++) {
//            Scanner model = new Scanner(System.in);
//            System.out.println("Input Model of a car: ");
//            carShop[i].setModel(model.nextLine());
//
//            Scanner color = new Scanner(System.in);
//            System.out.println("Input Color of a car: ");
//            carShop[i].setColor(color.nextLine());
//
//            Scanner capacity = new Scanner(System.in);
//            System.out.println("Input Capacity of a car: ");
//            carShop[i].setCapacityEngine(capacity.nextDouble());
//
//            Scanner year = new Scanner(System.in);
//            System.out.println("Input Year of a car: ");
//            carShop[i].setYearProduction(year.nextInt());
//        }

        for (int i = 0; i < carShop.length; i++) {
            carShop[i].printAllParameters();
//            carShop[i].printModelAndAge();
        }
        CarClass temp = new CarClass();
        for (int j = 0; j < carShop.length; j++) {

            for (int i = 0; i < carShop.length - 1 - j; i++) {
                if (carShop[i].getYearProduction() > carShop[i + 1].getYearProduction()) {
                    temp = carShop[i + 1];
                    carShop[i + 1] = carShop[i];
                    carShop[i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted cars from older to newer");
        for (int i = 0; i < carShop.length; i++) {
            carShop[i].printAllParameters();
        }

        int count = 0;
        for (int i = 0; i < carShop.length; i++) {
            if (carShop[i].getColor().equals("red")) {
                count++;
            }
        }

        CarClass[] carsRed = new CarClass[count];

        for (int i = 0; i < carsRed.length; i++) {
            carsRed[i] = new CarClass();
        }
        int a = 0;
        for (int i = 0; i < carShop.length; i++) {
            if (carShop[i].getColor().equals("red")) {
                carsRed[a] = carShop[i];
                a++;
            }
        }
        System.out.println();
        System.out.println("All red cars");
        for (int i = 0; i < carsRed.length; i++) {
            carsRed[i].printModel();
            carsRed[i].printColor();
        }
    }
}
