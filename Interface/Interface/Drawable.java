package Interface_MultipleInheritance.Interface.Interface;

import java.util.Scanner;

public interface Drawable {
    void draw();
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Rectangle is drawn");
    }
}

class Square extends Rectangle implements Drawable{
    // no need to override the abstract method draw() in Square.
    // Because it extends the Rectangle which overrides the square.
    public void draw(){
        System.out.println("Square is drawn");
    }

    public static void main(String[] args) {
        Drawable s = new Square();
        s.draw();
        Drawable r = new Rectangle();
        r.draw();
    }
}
