package Classes_Objects;

public class AppForm {
    String name;
    int rollNo;

    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        AppForm ram = new AppForm();
        ram.name = "xxxxx";
        ram.rollNo = 204053;
        ram.display();
        AppForm ravi = new AppForm();
        ravi.name = "yyyyy";
        ravi.rollNo = 204043;
        ravi.display();
    }
}
