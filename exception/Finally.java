package Handling_Exception.exception;

public class Finally {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("b is 0");
        }
        catch (Exception e){
            System.out.println("this is default");
        }
        finally {
            System.out.println("I will execute even the exception is occur or not");
        }
        System.out.println("Hello");
    }
}
