package polymorphism;

public class ConstructorOverloading {
    public static void main(String[] args) {
        bos blackBox = new bos(3,5,4);
        bos woodenBox = new bos();
        bos cube = new bos(4);
        System.out.println(blackBox.volume());
        System.out.println(woodenBox.volume());
        System.out.println(cube.cube());
    }
}

class bos{
    int length;
    int breadth;
    int height;
    bos(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    bos(){
        length = -1;
        breadth = -1;
        height = -1;
    }
    bos(int l){
        length = breadth = height = l;
    }
    int volume(){
        return length * breadth * height;
    }

    int cube(){
        return length * length * length;
    }
}
