package Interface_MultipleInheritance.Interface.Interface;

public interface InterfaceMain {
    // can interface have main
    // yes, but not serve same as in class
    static void main(String args[]){
        System.out.println("main from interface");
    }
    void abstractMethod();
}
class classMain implements InterfaceMain{
    @Override
    public void abstractMethod() {
        System.out.println("implementing of abstract method");
    }

    public static void main(String[] args) {
        InterfaceMain obj = new classMain();
        // abstract method calling...
        obj.abstractMethod();
        // static method calling...
        InterfaceMain.main(args);
    }
}
