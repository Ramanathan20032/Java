package Inheritance.singleInheritance;

// one parent class ---> one child class

public class single {
    public static void main(String[] args) {
        son obj = new son();
        System.out.println(obj.gender);
        obj.print();
    }
}

class father{
    char gender = 'M';
    void print(){

        System.out.println("father");
    }
}

class son extends father{

}
