package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("d:/abc.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("hello");

    }
}
