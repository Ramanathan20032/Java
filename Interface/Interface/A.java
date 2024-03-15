package Interface_MultipleInheritance.Interface.Interface;

public interface A {
    void run();
}

class B implements A{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        A obj = new B();
        obj.run();
    }
}
