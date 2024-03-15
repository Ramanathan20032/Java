package polymorphism.methodOverloading;

public class Sample {
    public static void main(String[] args) {
        Method obj = new Method();
        obj.min();
        obj.min(3,7);
        System.out.println(obj.min(obj.arr));
        System.out.println(obj.min(4,87,65));
    }
}
class Method{
    int[] arr = {1,2,3};
    void min(){
        System.out.println("this is minimum function");
    }

    void min(int a, int b){
        System.out.println(Math.min(a, b));
    }

    int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    int min(int a, int b, int c){
        return Math.min(a,Math.min(b, c));
    }
}
