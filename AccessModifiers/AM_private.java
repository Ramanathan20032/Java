package AccessModifiers;

public class AM_private {
    public static void main(String[] args) {
        xxx ob1 = new xxx();
        ob1.setName("Ramanathan");
        ob1.rollno = 204053;
        ob1.Display();
        xxx ob2 = new xxx();
        ob2.setValues("Ramar",204031);
        ob2.Display();
        System.out.println(ob2.getName() + ".M");
    }
}

class xxx{
    private String name;
    int rollno;

    public void setValues(String str, int rno){
        name = str;
        rollno = rno;
    }
    public void setName(String str){
        name = str;
    }

    public String getName(){
        return name;
    }
    void Display() {
        System.out.println(name);
        System.out.println(rollno);
        System.out.println();
    }
}
