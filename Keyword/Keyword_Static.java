package Keyword;

// static keyword

public class Keyword_Static {
    public static void main(String[] args) {

        System.out.println(father.gender);
        father.print();
//        System.out.println(daughter.gender);
        daughter.print();

    }
}

class father{
    static char gender = 'M';
    static void print(){
        System.out.println("parent class");
    }
}

class daughter extends father{
   char gender = 'F';
}
