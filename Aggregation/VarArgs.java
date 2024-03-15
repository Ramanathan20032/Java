package varArgs;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        print(1, 3, 2, 4, 5, 6, 7);
        foo(1, 2, "hi","hello","how");
        System.out.println(min(5, 7, 9, 4, 2, 11));
    }

    static void print(int... val){
        System.out.println(Arrays.toString(val));
    }

    static void foo(int a, int b, String... o){
        System.out.println(Arrays.toString(o));
    }
    static int min(int... w){
        int min = Integer.MAX_VALUE;
        for(int item : w){
            if(item < min){
                min = item;
            }
        }
        return min;
    }
}
