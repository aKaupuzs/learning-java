package lv.acodemy;

import lv.acodemy.classroom.Car;
import lv.acodemy.classroom.Cat;

public class Main {
    public static void main(String[] args) {
        Car myFirstCar = new Car();
        System.out.println(myFirstCar);
        myFirstCar.setCarBrand("Audi");
        System.out.println(myFirstCar);

        myFirstCar.setModel("A6");
        myFirstCar.setProductionYear(2024);
        myFirstCar.setMileage(6);
        myFirstCar.setColor("Royal Blue");
        System.out.println(myFirstCar);

        Car myOldCar = new Car();
        myFirstCar.setCarBrand("Lada");
        myFirstCar.setModel("2106");
        myFirstCar.setProductionYear(1967);
        myFirstCar.setMileage(321123);
        myFirstCar.setColor("Rust");
        System.out.println(myFirstCar);

        Car myBmwCar = new Car("BMW", "Z4", 2023, 1990, "Gold");
        System.out.println(myBmwCar);

        Car mySkoda = new Car.CarBuilder()
                .setCarBrand("Skoda")
                .setModel("Rapid")
                .setProductionYear(2024)
                .setMileage(199)
                .setColor("Aqua Blue")
                .build();
        System.out.println(mySkoda);

        mySkoda.start();
        mySkoda.drive(1000);

        Cat salem = new Cat("none", "Salem", 3, "black");
        System.out.println(salem);
        salem.setAge(2);
        salem.eat();
        salem.sleep();
    }
}