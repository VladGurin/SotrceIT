package homework89;


public class CarClass {
    //Написать класс для описания авомобиля – чтобы он сдержал свойства
    // (модель, цвет, объем двигателя, год выпуска) и поведение
    // (гетеры/сетеры для каждого поля, печатать всю информацию о машине,
    // подсчитывать возраст машины). Создать коструктор с параметрами

public String model;
private String color;
private double capacityEngine;
private int yearProduction;
private int age;

// конструктор
public CarClass (String model, String color, double capacityEngine, int yearProduction){
    this.model = model;
    this.color = color;
    this.capacityEngine = capacityEngine;
    this.yearProduction = yearProduction;
    this.age = 2020 - yearProduction;
}
public CarClass(){}

// вывод на ппечать параметров авто
public void printModel(){
    System.out.println("Model of car is: " + getModel());
}
public void printColor(){
    System.out.println("Color : " + getColor());
}
public void printCapacity(){
    System.out.println("Engine : " + getCapacityEngine());
}
public void printYearProduction(){
    System.out.println("Year of production: " + getYearProduction());
}
public void printAllParameters(){
    System.out.println("Model: " + getModel()+ " Color: " + getColor()+ " Engine: " + getCapacityEngine() + " Year: " + getYearProduction());
//    System.out.println("Color : " + getColor());
//    System.out.println("Engine : " + getCapacityEngine());
//    System.out.println("Year of production: " + getYearProduction());
}
public void printModelAndAge(){
    System.out.println("Model - " + getModel() + "; Age - " + age);
}

// геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCapacityEngine() {
        return capacityEngine;
    }

    public void setCapacityEngine(double capacityEngine) {
        this.capacityEngine = capacityEngine;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }


}
