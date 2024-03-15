package Clonning;

// shallow Clonning....

class Department{
    int deptID;
    String name;
    Department(int deptID, String name){
        this.deptID = deptID;
        this.name = name;
    }
    void display(){
        System.out.println("Dept Name : " + name);
        System.out.println("Dept ID   : " + deptID);
    }
}
class Student extends Object implements Cloneable{  // every class extends the object class by default.
    // for permission purpose to  clone the Student class.
    int id;
    String name;
    Department dept;
    Student(int id, String name, Department dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {     // clone is inside the object class
        return super.clone();
    }

    void display(){
        System.out.println("Id       : " + id);
        System.out.println("Name     : " + name);
        dept.display();
    }
}
public class ObjectClonning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Department dept = new Department(1,"physics");
        Student s1 = new Student(2,"Ram",dept);
        // It just Copies the reference of the s1.
        // both refers the same object memory
        // Student s2 = s1;
        Student s2 = (Student) s1.clone();

        s2.display();
    }
}
