package Keyword;

public class Keyword_this {
    public static void main(String[] args) {
        ben10 ob = new ben10();
        ob.print('M',50);
        System.out.println(ob.gender);
        System.out.println(ob.age);
    }
}

class ben10{
    char gender;
    int age;
    void print(char gender, int age){
        this.gender = gender;
        this.age = age;
    }
}
