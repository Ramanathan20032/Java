package Abstract_CLass_Methods;

abstract public class Member {
    String name;
    abstract void welcomeMessage();
}

class Teacher extends Member{
    @Override
    void welcomeMessage() {
        System.out.println("Hello Teacher...");
    }
}

class Student extends Member{
    @Override
    void welcomeMessage() {
        System.out.println("Hello Student...");
    }
}

class AbstractDemo{
    public static void main(String[] args) {
        Teacher ob1 = new Teacher();
        ob1.welcomeMessage();
        Student ob2 = new Student();
        ob2.welcomeMessage();

        Member[] m = new Member[4];
        m[0] = new Student();
        m[1] = new Student();
        m[2] = new Teacher();
        m[3] = new Teacher();

        for (Member m1 : m){
            m1.welcomeMessage();
        }
    }
}