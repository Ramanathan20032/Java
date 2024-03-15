package Interface_MultipleInheritance.Interface.MultipleInheritance;

interface father{
    // declaring
    abstract void call();
    abstract void talk();
}
interface mother{
    // declaring
    abstract void walk();
    abstract void play();
}

class son implements father,mother{
    //defining
    @Override
    public void call() {
        System.out.println("calling");
    }

    @Override
    public void talk() {
        System.out.println("talking");
    }

    @Override
    public void play() {
        System.out.println("playing");
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        son obj = new son();
        obj.call();
        obj.talk();
        obj.play();
        obj.walk();
    }
}