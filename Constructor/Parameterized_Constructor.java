package Constructor;

public class Parameterized_Constructor {
    public static void main(String[] args) {
        xample obj = new xample(204053,8.947);
        System.out.println(obj.rollNo);
        System.out.println(obj.marks);
    }
}
class xample{
    int rollNo;
    double marks;
    xample(int rno, double mark){
        rollNo = rno;
        marks = mark;
    }
}
