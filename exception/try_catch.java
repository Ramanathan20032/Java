package Handling_Exception.exception;

public class try_catch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            System.out.println("It is not possible");
        }
        System.out.println("Hello");
    }
}
