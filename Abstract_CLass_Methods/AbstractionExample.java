package Abstract_CLass_Methods;

abstract class Animal{
    private String name;
    public Animal(String name){
        this.name = name;
    }
    abstract void makeSound();

    public String getName(){
        return name;
    }
}
class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(getName() + " barks");
    }
}

class cat extends Animal{
    public cat(String name){
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(getName() + " Meow");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal d = new Dog("kathir");
        Animal c = new cat("rya");

        d.makeSound();
        c.makeSound();
    }
}
