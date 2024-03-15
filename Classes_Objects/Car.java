package Classes_Objects;

class door {
    String name;
    boolean isOpen;

    void open(){
        isOpen = true;
    }
    void close(){
        isOpen = false;
    }

    void printStatus(){
        if(isOpen){
            System.out.println(name + " Door is open");
        }
        else{
            System.out.println(name + " Door is closed");
        }
    }
}
public class Car {
    public static void main(String[] args) {
        door dd = new door();
        dd.name = "Driver";
        dd.open();
        dd.printStatus();
        door pd = new door();
        pd.name = "passenger";
        pd.close();
        pd.printStatus();
    }
}
