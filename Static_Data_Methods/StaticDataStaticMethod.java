package Static_Data_Methods;

public class StaticDataStaticMethod {
    public static void main(String[] args) {
        box b1 = new box(4);
        box b2 = new box();
        box b3 = new box(2, 3, 4);
        box b4 = new box(b3);
        System.out.println(box.bexCount);
        box.displayBexCount();
    }
}

class box {
    int length;
    int breadth;
    int height;

    static int bexCount;
    static {
        bexCount = 0;
    }
    static void displayBexCount(){
        System.out.println("Static_Data_Methods.bex Count : " + bexCount);
    }

    box(int l){
        length = breadth = height = l;
        bexCount++;
    }
    box(){
        length = -1;
        breadth = -1;
        height = -1;
        bexCount++;
    }
    box(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
        bexCount++;
    }
    box(box b){
        length = b.length;
        breadth = b.breadth;
        height = b.height;
        bexCount++;
    }
}
