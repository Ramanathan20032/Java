package Composition;

public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ram");
        student.setDateOfBirth("25/02/2003");
        student.setHasStudentHousing(true);

        System.out.println("Name : " + student.getName());
        System.out.println("DOB  : " + student.getDateOfBirth());
        System.out.println("Housing : " + (student.getHasStudentHousing() ? "yes" : "No"));
    }
}

class Student{
    private String name;
    private String dateOfBirth;
    private boolean hasStudentHousing;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setHasStudentHousing(boolean hasStudentHousing){
        this.hasStudentHousing = hasStudentHousing;
    }
    public boolean getHasStudentHousing(){
        return hasStudentHousing;
    }
}
