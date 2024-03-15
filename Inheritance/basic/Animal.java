package Inheritance.basic;

public class Animal {
    int no_of_legs = 4;
    void eat(){
        System.out.println("I am eating");
    }
    void walk(){
        System.out.println("I am Walking");
    }
}

class dog extends Animal{
    boolean canBark = true;
}

class cat extends Animal{
    boolean hasGreenEyes = true;
}

class Main{
    public static void main(String[] args) {
        Animal obj = new Animal();
        System.out.println(obj.no_of_legs);
        obj.eat();
        obj.walk();
        System.out.println();

        dog obj1 = new dog();
        System.out.println(obj.no_of_legs);
        System.out.println("canBark : "+obj1.canBark);
        obj1.eat();
        obj1.walk();
        System.out.println();

        cat obj2 = new cat();
        System.out.println(obj.no_of_legs);
        System.out.println("hasGreenEyes : "+obj2.hasGreenEyes);
        obj2.eat();
        obj2.walk();
        System.out.println();
    }
}

