package Keyword;

// final keyword...

public class Keyword_Final {
    public static void main(String[] args) {
        b obj = new b();
        System.out.println(obj.gender);
    }
}

class a{
    final char gender = 'M';
    final void print(){
//        gender = 'm';
        System.out.println("parent class");
    }
}

class b extends a{
    char gender = 'F';
//    void print(){
//        System.out.println("child class");
//    }
}