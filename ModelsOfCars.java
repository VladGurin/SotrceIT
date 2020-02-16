package homework89;

public class ModelsOfCars {
    public static void main(String[] args) {

        CarClass car1 = new CarClass("Audi", "red", 3.0, 2015);
        CarClass car2 = new CarClass("KIA", "blue", 2.2, 2017);
        CarClass car3 = new CarClass("Toyota", "white", 2.0, 2019);


       car1.printAllParameters();
       car2.printAllParameters();
       car3.printAllParameters();

       CarClass car4 = new CarClass();
       car4.setModel("Lexus");
       car4.setColor("black");
       car4.setCapacityEngine(3.5);
       car4.setYearProduction(2020);

       car4.printAllParameters();

       car1.printModelAndAge();
       car2.printModelAndAge();
       car3.printModelAndAge();
       car4.printModelAndAge();


        CarClass[] carShop = new  CarClass[5];

        carShop[0] = car1;

    }
}
