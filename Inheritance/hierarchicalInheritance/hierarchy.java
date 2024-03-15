package Inheritance.hierarchicalInheritance;

// one parent ---> two children

public class hierarchy {
    public static void main(String[] args) {
        son obj = new son();
        System.out.println(obj.gender);
        obj.print();

        daughter obj1 = new daughter();
        System.out.println(obj1.gender);
        obj1.print();
    }
}

class father{
    char gender = 'M';
    void print(){
        System.out.println("father");
    }
}
class daughter extends father{
    char gender = 'F';

    @Override
    void print() {
        System.out.println("daughter");
    }
}
class son extends father{
    @Override
    void print() {
        System.out.println("son");
    }
}
