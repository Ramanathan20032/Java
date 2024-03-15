package Interface_MultipleInheritance.Interface.MultipleInheritance;

interface print{
    void print();
}

interface show extends print{
    void show();
}

public class InterfaceInheritance implements show{
    @Override
    public void print() {
        System.out.println("print");
    }
    @Override
    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        InterfaceInheritance obj = new InterfaceInheritance();
        obj.print();
        obj.show();
    }
}
