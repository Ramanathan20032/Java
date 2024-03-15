package Abstract_CLass_Methods;

abstract public class Shape {
    abstract int area(int a);
}

class Square extends Shape{
    @Override
    int area(int a) {
        return a * a;
    }
}

class Cube extends Shape{
    @Override
    int area(int a) {
        return 6 * a * a;
    }
}

class Abstract{
    public static void main(String[] args) {
        Square ob1 = new Square();
        System.out.println(ob1.area(2));
        Cube ob2 = new Cube();
        System.out.println(ob2.area(2));

        Shape[] shape = new Shape[2];
        shape[0] = new Square();
        shape[1] = new Cube();

        for(Shape s : shape){
            System.out.println(s.area(4));
        }
    }
}
