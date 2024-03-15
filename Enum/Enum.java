package Enum;

enum level{

    BEGINNER("B"),INTERMEDIATE("I"),ADVANCED("A");
    private String abbr;
    level(String ab){
        abbr = ab;
    }
    public String getAbbr(){
        return abbr;
    }


}
public class Enum {
    public static void main(String[] args) {
        level l1 = level.BEGINNER;
        System.out.println(l1.toString());
        System.out.println(l1.getAbbr());
        level l2 = level.ADVANCED;
        System.out.println(l2.ordinal()); // index
        System.out.println(l2.getAbbr());
        level l3 = level.INTERMEDIATE;
        System.out.println(l3);
        System.out.println(l3.getAbbr());
    }
}
