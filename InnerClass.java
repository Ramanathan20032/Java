package logicFirst;

class Outer{
    int num = 10;
    void outerDisplay(){
        System.out.println("Outer class");
    }
    // static class Inner
    class Inner{
        int x;
        void innerDisplay(){
            System.out.println("Inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner i = o.new Inner();
        // if it is declared as a static
        // Outer.Inner i = new Outer.Inner();
        i.innerDisplay();
    }
}
