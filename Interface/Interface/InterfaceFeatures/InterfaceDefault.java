package Interface_MultipleInheritance.Interface.Interface.InterfaceFeatures;

interface Drawable{
    void draw();
    default void msg(){
        System.out.println("Default Method");
    }
}

class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class InterfaceDefault {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
        d.msg();
    }
}
