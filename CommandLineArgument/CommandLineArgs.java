package CommandLineArgument;

public class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[0]+args[1]);

        System.out.println("---------------------------------");

        for(int i = 0 ; i < args.length ; i++){
            System.out.print(args[i]  + " ");
        }
    }
}
