package Interface_MultipleInheritance.Interface.Interface;

interface rideable{
    void ride();
    default void display(){
        System.out.println("I am from rideable Interface");
    }
    default void welcome(){
        System.out.println("hello.....");
    }
}
class Car implements rideable{
    @Override
    public void ride() {
        System.out.println("you are riding a car");
    }

    @Override
    public void display() {
        System.out.println("I am from car class");
    }
}
class Bike implements rideable{
    @Override
    public void ride() {
        System.out.println("you are riding a bike");
    }
}

class Mechanic{
    void check(rideable r){
        System.out.println("checking");
        r.ride();
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        rideable r = new Car();
        Mechanic m = new Mechanic();
        Car c = new Car();
        Bike b = new Bike();
        c.display();
        c.welcome();
        m.check(c);
        m.check(b);
    }
}
