package logicFirst;

public class StackChar {
    public static void main(String[] args) {
        Stack1 s1 = new Stack1();
        s1.push('a');
        s1.push('b');
        s1.push('c');
        s1.push('d');
        s1.push('e');

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}

class Stack1{
    char[] arr = new char[10];
    int tos;

    Stack1(){
        tos = -1;
    }

    void push(char item) {
        if(tos == 9){
            System.out.println("Stack is full");
        }
        else{
            arr[++tos] = item;
        }
    }

    char pop(){
        if(tos >= 0){
            return arr[tos--];
        }
        else{
            return '@';
        }
    }
}
