package Encapsulation;

public class Rectangle {
    private int height;
    private int width;

    public void setHeight(int h){
        height = h;
    }
    public void setWidth(int w){
        width = w;
    }
    public void printStatus(){
        System.out.println(height * width);
    }
}

class RectDetails {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setHeight(12);
        r1.setWidth(15);
        r1.printStatus();
        Rectangle r2 = new Rectangle();
        r2.setHeight(2);
        r2.setWidth(4);
        r2.printStatus();
    }
}