package logicFirst;

public class ambiguity {
    public static void sum(int a , long b){
        System.out.println(a+b);
    }

    public static void sum(long a , int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        sum(333, 34L);
    }
}
