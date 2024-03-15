package Interface_MultipleInheritance.Interface;

interface rideable{
    void ride();
}
class car implements rideable{
    @Override
    public void ride() {
        System.out.println("I am riding a car");
    }
}
class bike implements rideable{
    @Override
    public void ride() {
        System.out.println("I am riding a bike");
    }
}
public class InterfaceAnonymes {
    public static void main(String[] args) {
        // interface can't create the object
        // But it can be done by creating the anonymes class and override their abstract methods
        rideable r = new rideable() {
            @Override
            public void ride() {
                System.out.println("I am riding a vintage car");
            }
        };
        r.ride();
    }
}
