package Classes_Objects;

public class parameterizedFunction {
    String Name;
    int rollNo;

    public void Display(){
        System.out.println(rollNo);
        System.out.println(Name);
        System.out.println();
    }
    public void setName(String str){
        Name = str;
    }
    public void setRollNo(int rno){
        rollNo = rno;
    }
    public void setValues(String str, int rno) {
        Name = str;
        rollNo =  rno;
    }
}

class Main{
    public static void main(String[] args) {
        parameterizedFunction ramar = new parameterizedFunction();
//        ramar.setName("yyyy");
//        ramar.setRollNo(204031);
        ramar.setValues("yyyy", 204031);
        ramar.Display();
        parameterizedFunction ram = new parameterizedFunction();
        ram.setName("xxxx");
        ram.setRollNo(204053);
        ram.Display();
    }
}