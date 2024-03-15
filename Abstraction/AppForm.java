package Abstraction;

public class AppForm {
    int rollno;
    private String name;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setName(String str){
        name = str;
    }
    public void setRollNo(int rno){
        rollno = rno;
    }
    public void setValues(String str, int rno){
        name = str;
        rollno = rno;
    }
    public int getRollno(){
        return rollno;
    }
}

class Main{
    public static void main(String[] args) {
        AppForm obj = new AppForm();
        obj.setName("Ramanathan");
        obj.rollno = 204053;
        obj.display();
        AppForm obj1 = new AppForm();
        obj1.setName("xxxxx");
        obj1.setRollNo(204001);
        obj1.display();
        AppForm obj2 = new AppForm();
        obj2.setValues("yyyyy", 204002);
        obj2.display();
        System.out.println();
        System.out.println(obj.getRollno());
    }
}