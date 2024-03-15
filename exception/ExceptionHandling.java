package Handling_Exception.exception;

// user - userDefined exception
class User extends Exception{
    User(String str){
        super(str);
    }

}

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            check(19);
        }
        catch (User E){
            System.out.println(E.getMessage());
        }
        catch (ArithmeticException E){
            System.out.println(E.getMessage());
        }
    }

    static void check(int age) throws User,ArithmeticException{
        if(age < 18){
            throw new User("Invalid Age");
        }
        else{
            throw new ArithmeticException("Valid Age");
        }
    }







    static void basic(){
        int a = 5;
        int b = 10;
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException E){
            System.out.println("Not possible");
        }
        catch (Exception E){
            System.out.println("Default Exception");
        }
        finally {
            System.out.println("I will execute even if Exception occurs or not");
        }
        System.out.println("Hello");
    }
}
