package Interface_MultipleInheritance.Interface.Interface;

public interface Bank {
    float rateOfInterest();
}
class Sbi implements Bank{
    @Override
    public float rateOfInterest() {
        return 8.5f;
    }
}
class icici implements Bank{
    @Override
    public float rateOfInterest() {
        return 7.3f;
    }
}
class axis implements Bank{
    @Override
    public float rateOfInterest() {
        return 9.7f;
    }
}

class Test {
    public static void main(String[] args) {
        Bank b1 = new Sbi();
        Bank b2 = new axis();
        Bank b3 = new icici();

        System.out.println("ROI : " + b1.rateOfInterest());
        System.out.println("ROI : " + b2.rateOfInterest());
        System.out.println("ROI : " + b3.rateOfInterest());
    }
}
