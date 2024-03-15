package Inheritance.basic;

import com.sun.source.tree.LambdaExpressionTree;

import java.awt.image.CropImageFilter;
import java.util.Vector;

public class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }
}

class Car extends Vehicle{
    int numberOfDoors;
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    void honk(){
        System.out.println("honk.. honk..");
    }
}

class Bike extends Vehicle{
    boolean hasSideCar;
    Bike(String brand, int year, boolean hasSideCar){
        super(brand,year);
        this.hasSideCar = hasSideCar;
    }
    void wheeling(){
        System.out.println("Performing a Wheeling");
    }
}
class control{
    public static void main(String[] args) {
        Car obj1 = new Car("tata",2023,4);
        obj1.start();
        obj1.honk();
        obj1.stop();
        Bike obj2 = new Bike("honda",2022,true);
        obj2.start();
        obj2.wheeling();
        obj2.stop();
    }
}
