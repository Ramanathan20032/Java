package Inheritance.basic;

public class Employee {
    private String name;
    private double salary;
    private String joinDate;
    Employee(String name, double salary, String joinDate){
        this.name = name;
        this.salary = salary;
        this.joinDate = joinDate;
    }
    //    Employee(){
//        this.name = "";
//        this.salary = 0.0;
//        this.joinDate = "";
//    }
//    if super is not declare then we need a dummy constructor.
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }
    public String getJoinDate(){
        return joinDate;
    }
    public void raiseSalary(double percent){
        this.salary = salary + salary * percent/100;
    }
    public void display(){
        System.out.println("Employee Name : " + name);
        System.out.println("JoinDate      : " + joinDate);
        System.out.println("Salary        : " + salary);
    }
}

class Manager extends Employee{
    private double bonus;
    Manager(String name, double salary, String joinDate, double bonus){
        super(name,salary,joinDate);
        this.bonus = bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total         : " + (bonus + super.getSalary()));
    }
}

class EmpDetails{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ram",35000,"25/07");
        emp1.raiseSalary(10);
        emp1.display();
        System.out.println();
        Manager m1 = new Manager("rahul",65000,"07/12",0.0);
        m1.setBonus(20000);
        m1.display();
    }
}
