package Abstract_CLass_Methods;

import java.awt.image.BaseMultiResolutionImage;

public abstract class Bank {
    abstract float rateOfInterest();
}
class axis extends Bank{
    float rateOfInterest(){
        return 8.5f;
    }
}
class sbi extends Bank {
    float rateOfInterest(){
        return 7.3f;
    }
}

class test{
    public static void main(String[] args) {

        Bank[] banks = new Bank[3];
        banks[0] = new sbi();
        banks[1] = new axis();
        banks[2] = new sbi();

        for(Bank b : banks){
            System.out.println(b.rateOfInterest());
        }
    }
}
