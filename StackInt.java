package logicFirst;

public class StackInt {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(5);
        s1.push(10);
        s1.push(8);


        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}

class Stack{
    private int[] arr = new int[10];
    private int tos;
    Stack(){

        tos = -1;
    }

    public void push(int item){
        if(tos == arr.length){
            System.out.println("stack is full");
        }
        else {
            arr[++tos] = item;
        }
    }

    public int pop(){
        if(tos >= 0) {
            return arr[tos--];
        }
        else{
            return -1;
        }
    }
}