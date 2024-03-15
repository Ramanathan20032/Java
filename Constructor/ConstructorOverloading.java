package Constructor;

public class ConstructorOverloading {
    public static void main(String[] args) {
        bex blackBox = new bex(3,5,4);
        bex woodenBox = new bex();
        bex cube = new bex(4);
        System.out.println(blackBox.volume());
        System.out.println(woodenBox.volume());
        System.out.println(cube.cube());
    }
}
class bex {
    int length;
    int breadth;
    int height;
    bex(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    bex(){
        length = -1;
        breadth = -1;
        height = -1;
    }
    bex(int l){
        length = breadth = height = l;
    }
    int volume(){
        return length * breadth * height;
    }

    int cube(){
        return length * length * length;
    }
}

