package Classes_Objects;

class box {
    int length;
    int breadth;
    int height;
    int area;

    int volume(){
        return length * height * breadth;
    }
    int surfaceArea(){
        return 6 * (area * area);
    }

}

public class vain{
    public static void main(String[] args) {
        box blackBox = new box();
        blackBox.height = 20;
        blackBox.breadth = 25;
        blackBox.length = 23;
        blackBox.area = 2;
        System.out.println("black box volume : " + blackBox.volume());
        System.out.println("black box surfaceArea : " + blackBox.surfaceArea());

        box woodenBox = new box();
        woodenBox.height = 15;
        woodenBox.breadth = 23;
        woodenBox.length = 20;
        woodenBox.area = 4;
        System.out.println("wooden box volume : " + woodenBox.volume());
        System.out.println("wooden box surfaceArea : " + woodenBox.surfaceArea());
    }
}