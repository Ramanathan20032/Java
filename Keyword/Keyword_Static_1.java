package Keyword;

public class Keyword_Static_1 {
    public static void main(String[] args) {
        System.out.println(mother.age);
        son.age = 20;
        System.out.println(mother.age);
        System.out.println(son.age);
    }
}

class mother{
    static char gender = 'F';
    static int age = 40;
    static void print(){
        System.out.println("parent class");
    }
}

class son extends mother{
    char gender = 'M';
}
