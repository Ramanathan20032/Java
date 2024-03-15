package Passing_Value_Reference;


// passing object as argument in parameter
public class PassingObjectAsArgument {
    public static void main(String[] args) {
        boox blackBox = new boox();
        boox b1 = new boox();

        blackBox.setDimension(2,3,4);
        b1.setDimension(2,4,4);
        System.out.println(blackBox.isEqual(b1));

        boox b2 = new boox(b1);
    }
}

class boox{
    int length;

    int breadth;
    int height;

    boox(){

    }
    boox(boox b){  // copy constructor
        length = b.length;
        breadth = b.breadth;
        height = b.height;
    }
    void setDimension(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }

    boolean isEqual(boox b){
        if(length == b.length && breadth == b.breadth && height == b.height){
            return true;
        }
        return false;
    }
}
