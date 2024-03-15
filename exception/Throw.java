package Handling_Exception.exception;

public class Throw {
    public static void main(String[] args) {
        try {
            check(17);
        }
        catch (ArithmeticException E){
            System.out.println(E);
            System.out.println(E.getMessage());
        }
    }

    static void check(int age){
        if(age < 18){
            throw new ArithmeticException("Age invalid");
        }
    }
}
