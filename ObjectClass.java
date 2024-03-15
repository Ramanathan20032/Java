package logicFirst;

public class ObjectClass {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");
        // String Constant Memory
        System.out.println(s1 == s2);
        // objects
        // comparing both the object referring the same memory.
        System.out.println(s3 == s4);
        // it compares the content of the String.
        System.out.println(s3.equals(s4));
    }
}
