package Classes_Objects;

public class ApplForm {
    String name;
    int rollNo;

    public void Display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println("=====================");
    }
}

class pain{
    public static void main(String[] args) {
        ApplForm ram = new ApplForm();
        ram.name = "xxxx";
        ram.rollNo = 204053;
        ram.Display();
        ApplForm ravi = new ApplForm();
        ravi.name = "yyyy";
        ravi.rollNo = 204043;
        ravi.Display();
    }
}
