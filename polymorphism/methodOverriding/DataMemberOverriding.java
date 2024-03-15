package polymorphism.methodOverriding;

class Bike{
    int speedLimit = 50;
}
class Honda extends Bike{
    int speedLimit = 150;
}

public class DataMemberOverriding {
    public static void main(String[] args) {

//        derived class cant be referred by base class
//        Honda h = new Bike();

        Honda h = new Honda();
        System.out.println(h.speedLimit);  // 150
        // Output: 150 (Accessing speedLimit from Honda class)

        Bike b1 = new Honda();
        System.out.println(b1.speedLimit);  // 50
        // Output: 50 (Accessing speedLimit from Bike class)
        // Even though the actual object is of type Honda, the reference is of type Bike,
        // so it accesses the speedLimit from the base class.

        Bike b2 = new Bike();
        System.out.println(b2.speedLimit); // 50
        // Output: 50 (Accessing speedLimit from Bike class)
        // Accessing speedLimit directly from an object of the Bike class.
    }
}

