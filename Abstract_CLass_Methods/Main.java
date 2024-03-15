package Abstract_CLass_Methods;

abstract class computer{
    public computer(){
        System.out.println("hi");
    }
    abstract void turnOff();
    int windows = 8;
    void turnOn(){
        System.out.println("turn on");
    }
}

class hp extends computer{
    int windows = 10;
    @Override
    void turnOn() {
        System.out.println("turning... ON");
    }

    @Override
    void turnOff() {
        System.out.println("turning.. Off - HP");
    }
}

class dell extends computer{
    int windows = 11;
    @Override
    void turnOn() {
        System.out.println("turning... ON");
    }

    @Override
    void turnOff() {
        System.out.println("turning.. off - DELL");
    }
}

public class Main {
    public static void main(String[] args) {
        hp obj = new hp();
        System.out.println(obj.windows);
        obj.turnOn();
        obj.turnOff();
        dell obj1 = new dell();
        System.out.println(obj1.windows);
        obj1.turnOn();
        obj1.turnOff();
    }
}