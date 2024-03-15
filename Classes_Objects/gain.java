package Classes_Objects;

class Student{

    String name;
    int rollNo;
    int[] marks;

    int marksTotal(){
        int total = 0;
        for(int mark : marks){
            total = total + mark;
        }
        return total;
    }

    void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(marksTotal());
    }
}

public class gain {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.name = "zzzz";
        stud1.rollNo = 10;
        stud1.marks = new int[]{24, 20, 20};
        Student stud2 = new Student();
        stud2.name = "xxxx";
        stud2.rollNo = 12;
        stud2.marks = new int[]{20, 20, 20};
        Student stud3 = new Student();
        stud3.name = "yyyy";
        stud3.rollNo = 14;
        stud3.marks = new int[]{15, 20, 20};

        stud1.display();
//        stud2.display();
//        stud3.display();
    }
}
