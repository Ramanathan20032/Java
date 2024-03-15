package polymorphism.methodOverriding;

public class Animal {
    int no_of_legs = 4;
    void eat(){
        System.out.println("I am eating");
    }
    void walk(){
        System.out.println("I m walking");
    }
}
class dog extends Animal{
    boolean canBark = true;
    int no_of_legs = 5;

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Main{
    public static void main(String[] args) {
        dog obj = new dog();
        System.out.println(obj.no_of_legs);
        System.out.println(obj.canBark);
        obj.eat();
        obj.walk();
    }
}
