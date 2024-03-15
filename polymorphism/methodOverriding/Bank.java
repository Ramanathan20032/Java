package polymorphism.methodOverriding;

import polymorphism.A;

public class Bank {
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 8.4f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 7.3f;
    }
}
class Axis extends Bank{
    float getRateOfInterest(){
        return 9.7f;
    }
}
class vain{
    public static void main(String[] args) {
        Bank b1 = new SBI();
        System.out.println("SBI rate of interest   : "   + b1.getRateOfInterest());
        Bank b2 = new ICICI();
        System.out.println("ICICI rate of interest : " + b2.getRateOfInterest());
        Bank b3 = new Axis();
        System.out.println("AXIS rate of interest  : " + b3.getRateOfInterest());
    }
}
