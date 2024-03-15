package Passing_Value_Reference;

public class passingReference {
    public static void main(String[] args) {
        box b1 = new box(2,3,4);
        box b2 = new box(b1);

        System.out.println(b1.isEqual(b2));
        System.out.println(b2.length);
    }
}

class box{
    int length;
    int breadth;
    int height;

    box(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }

    box(box b){
        length = b.length;
        breadth = b.breadth;
        height = b.height;
    }

    boolean isEqual(box b){
        b.length++;
        if(length == b.length && breadth == b.breadth && height == b.height){
            return true;
        }
        return false;
    }
}
