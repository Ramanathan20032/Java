package Interface_MultipleInheritance.Interface.Interface.InterfaceFeatures;

import Composition.StudentDetails;

interface teacher{
    static void print(){
        System.out.println("I am a teacher.");
    }
    void show();
}

class student implements teacher{
    @Override
    public void show() {
        System.out.println("I am a student");
    }
}
public class InterfaceStatic {
    public static void main(String[] args) {
        teacher t = new student();

        // calling the abstract method
        t.show();

        // calling the static method
        teacher.print();
    }
}
