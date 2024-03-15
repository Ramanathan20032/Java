package CallByValue;

public class Example1 {
    int data = 50;
    void change(int data){
        data = data + 500;
    }
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        System.out.println("Before change : " + e1.data);
        e1.change(500);
        // The changes being done in the called method, is not affected in the calling method.
        System.out.println("after change : " + e1.data);
    }
}
