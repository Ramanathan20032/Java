package AccessModifiers;

public class AM_public {
    public static void main(String[] args) {
        yyy ob1 = new yyy();
        ob1.name = "yyyy";
        ob1.rollNo = 204053;
        ob1.display();
        yyy ob2 = new yyy();
        ob2.setName("xxxx");
        ob2.setRollNo(204031);
        ob2.display();
        yyy ob3 = new yyy();
        ob3.setvalues("zzzz",204043);
        ob3.display();
        System.out.println(ob1.rollNo    + " " + ob2.rollNo    + " " + ob3.rollNo);
        System.out.println(ob1.getName() + " " + ob2.getName() + " " + ob3.getName());
    }
}

class yyy{
    String name;
    int rollNo;
    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println();
    }

    public void setName(String str){
        name = str;
    }

    public void setRollNo(int rno){
        rollNo = rno;
    }

    public void setvalues(String str, int rno){
        name = str;
        rollNo = rno;
    }

    public String getName(){
        return name;
    }
}
