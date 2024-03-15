package Aggregation;

class Operation{
     int square(int n){
         return n * n;
     }
}

class Circle{
    Operation op;
    double Pi = 3.14;
    double area(int radius){
        op = new Operation();
        int rSquare = op.square(radius);
        return rSquare * Pi;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}
