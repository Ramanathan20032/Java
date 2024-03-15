package Interface_MultipleInheritance.Interface.MultipleInheritance;

public interface Printable {
    void print();
}
interface Showable {
    void print();
}

class test implements Printable,Showable{

    @Override
    public void print() {
        System.out.println("Printing");
    }

    public static void main(String[] args) {
        test obj = new test();
        obj.print();
    }
}

