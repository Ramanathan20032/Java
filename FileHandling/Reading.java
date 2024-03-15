package FileHandling;

import java.io.File;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        try {
            File f = new File("Example.txt");
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        }
        catch (Exception E){
            System.out.println(E);
        }
    }
}