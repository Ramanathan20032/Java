package Handling_Exception.exception;

//class UserDefined extends Exception{
//    String msg;
//    UserDefined(String msg){
//        this.msg = msg;
//    }
//
//    String getMsg(){
//        return this.msg;
//    }
//}

class UserDefined extends Exception{
    UserDefined(String str){

        super(str);
    }
}

public class userDefinedException {
    static void check(int age) throws UserDefined,ArithmeticException{
        if(age < 18){
            throw new UserDefined("invalid age");
//            System.out.println("Invalid age");
        }
        else {
            throw new ArithmeticException("valid age");
//            System.out.println("valid age");
        }
    }

    public static void main(String[] args) {
        try {
            check(6);
        }
        catch (UserDefined E){
            System.out.println(E.getMessage());
        }
        catch (ArithmeticException E){
            System.out.println(E.getMessage());
        }
    }
}
