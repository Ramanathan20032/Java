package InstanceInitializerBlock;

import Package.Example1.Mypack.B;

public class Bike {
    Bike(){
        System.out.println("constructor is invoked.");
    }
    {
        System.out.println("ïnstance initializer block 2");
    }

    public static void main(String[] args) {
        {
            System.out.println("ïnstance initializer block 1");
        }
        Bike b1 = new Bike();
        {
            System.out.println("ïnstance initializer block 3");
        }
        Bike b2 = new Bike();
        {
            System.out.println("ïnstance initializer block 4");
        }
    }
}
