package Passing_Value_Reference;

public class passingValue {
    public static void main(String[] args) {
        // increment
        int a = 10;
        increment(a);  // 11
        System.out.println(a); // 10
        increment(a);  // 11

        // add
        System.out.println(add(1,2));

        // swap
        int c = 1;
        int d = 2;
        swap(c, d);  // c = 2 , d = 1
        System.out.println(c); // 1
        System.out.println(d); // 2
    }

    static void increment(int a){
        ++a;
    }
    static int add(int a, int b){
       return a + b;
    }
    static void swap(int first, int second){
        int temp = first;
        first = second;
        second = temp;
        System.out.println(first);
        System.out.println(second);
    }
}
