package Inheritance.multilevelInheritance;

// parent class ---> (child class)parent class ---> child lass
public class multilevel {
    public static void main(String[] args) {
        daughter obj = new daughter();
        System.out.println(obj.gender);
        obj.print();
    }
}

class grandfather{
    char gender = 'M';
    void print(){

        System.out.println("grandfather");
    }
}

class mother extends grandfather{
    char gender = 'F';
    @Override
    void print() {
        System.out.println("mother");
    }
}

class daughter extends mother{
    @Override
    void print() {
        System.out.println("daughter");
    }
}
