package Encapsulation;

class Main {
    public static void main(String[] args) {
        AppForm xxx = new AppForm();
        xxx.name = "dhoni";
        xxx.rollno = 18;
        xxx.Display();
        AppForm yyy = new AppForm();
        yyy.setValues("virat",7);
        yyy.Display();
    }
}
public class AppForm {
    int rollno;
    String name;
    public void Display(){
        System.out.println(rollno);
        System.out.println(name);
    }
    public void setValues(String str, int rno){
        rollno = rno;
        name = str;
    }
}