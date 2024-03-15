package Inheritance.hybridInheritance;

// combination of two inheritance
// hierarchy + single

public class hybrid {
    public static void main(String[] args) {
        grandDaughter obj = new grandDaughter();
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
    @Override
    void print() {
        System.out.println("son");
    }
}

class daughter extends father{
    char gender = 'F';
    @Override
    void print() {
        System.out.println("daughter");
    }
}

class grandDaughter extends daughter {
    @Override
    void print(){
        System.out.println("grandDaughter");
    }
}