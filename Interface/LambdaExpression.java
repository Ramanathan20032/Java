package Interface_MultipleInheritance.Interface;

interface water{
    // functional interface - A interface with single abstract method is called functional interface.
    void status();
}

class gas implements water{
    @Override
    public void status() {
        System.out.println("gaseous form");
    }
}

class solid implements water{
    @Override
    public void status() {
        System.out.println("solid form");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        water w =  () -> System.out.println("liquid form");
        w.status();
        water w1 = new solid();
        w1.status();
        water w2 = new gas();
        w2.status();
    }
}
