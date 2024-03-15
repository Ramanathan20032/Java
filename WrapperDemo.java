package logicFirst;

public class WrapperDemo {
    public static void main(String[] args) {
        int i = 10;
        Integer i1 = Integer.valueOf(i);    // boxing, Wrapping
        Integer i3 = 20;                    // auto-Boxing

        int i2 = i1.intValue();  // unBoxing
        int k = i2;              // Auto UnBoxing
    }
}
