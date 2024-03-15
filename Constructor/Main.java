package Constructor;

public class Main {
    public static void main(String[] args) {
        box blackBox = new box(0,0,0);
        box woodenBox = new box(0,0,0);

        blackBox.setDimension(1,3,5);
        woodenBox.setDimension(2,3,5);
        System.out.println(blackBox.getHeight());
    }
}

class box{
    int length;
    int breadth;
    int height;

    int getHeight(){
        return height;
    }

    box(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    void setDimension(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }


}

