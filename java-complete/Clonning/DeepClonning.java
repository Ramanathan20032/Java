package Clonning;

class Department1 implements Cloneable{
    int deptID;
    String name;
    Department1(int deptID, String name){
        this.deptID = deptID;
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    void display(){
        System.out.println("Dept Name : " + name);
        System.out.println("Dept ID   : " + deptID);
    }
}
class Student1 extends Object implements Cloneable{
    int id;
    String name;
    Department1 dept;
    Student1(int id, String name, Department1 dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
//        s.dept = (Department1)  s.dept.clone();
        return s;
    }

    void display(){
        System.out.println("Id       : " + id);
        System.out.println("Name     : " + name);
        dept.display();
    }
}
public class DeepClonning{
    public static void main(String[] args) {
        Department1 dept = new Department1(1,"maths");
        Student1 s1 = new Student1(2,"Ram",dept);

    }
}
