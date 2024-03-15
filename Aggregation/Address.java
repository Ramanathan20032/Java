package Aggregation;

public class Address {
    String city;
    String state;
    String country;
    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee{
    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address = new Address("kkdi","tamilNadu","India");
        Address address1 = new Address("mdu","tamilNadu","India");

        Employee emp1 = new Employee(1,"ram",address);
        Employee emp2 = new Employee(2,"raj",address1);

        emp1.display();
        emp2.display();
    }
}


