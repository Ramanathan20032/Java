package Constructor;

public class Rectangle {
    private int height = 1;
    private int width = 1;
    Rectangle(int h, int w){
        setHeight(h);
        setWidth(w);
    }
    void setHeight(int h){
        if (h > 0){
            height = h;
        }
    }
    void setWidth(int w){
        if(w > 0){
            width = w;
        }
    }
    int getHeight(){
        return height;
    }
    int getWidth(){
        return width;
    }
}

class RectDetails{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,7);
        Rectangle r2 = new Rectangle(-1,9);
        System.out.println(r1.getHeight() + " " + r1.getWidth());
        System.out.println(r2.getHeight() + " " + r2.getWidth());
    }
}
