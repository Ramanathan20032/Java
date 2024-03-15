package InstanceInitializerBlock;

class Sample{
    {
        System.out.println("Initializer Block 1");
    }
    Sample(){
        System.out.println("From Sample constructor");
    }
    {
        System.out.println("Initializer Block 2");
    }
}
public class Example1 {

    public static void main(String ar[]){
        {
            System.out.println("Initializer Block 3");
        }


        Sample s = new Sample();
        System.out.println("From Main Method");

        {
            System.out.println("Initializer Block 4");
        }
    }
}