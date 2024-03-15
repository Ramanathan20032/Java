package Keyword;

// super keyword....

public class Keyword_Super {
    public static void main(String[] args) {
        c ob1 = new c();
        System.out.println(ob1.gender);
        d ob2 = new d();
        ob2.print();
    }
}

class c{
    char gender = 'M';
    byte age = 50;
    void print(){
        System.out.println("PARENT CLASS");
    }
}

class d extends c{
    char gender = 'F';

    void print(){
        System.out.println("CHILD CLASS");
        System.out.println(super.gender);
        super.print();
    }
}
