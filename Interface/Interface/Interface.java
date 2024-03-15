package Interface_MultipleInheritance.Interface.Interface;

interface method  {
    abstract void talk();
    abstract void walk();
}

class Interface implements method {
    @Override
    public void talk() {
        System.out.println("talking");
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }

    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.talk();
        obj.walk();
    }
}


