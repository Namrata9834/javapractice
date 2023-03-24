package exception_handling;

//import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
class ReadWrite {
    void read () throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }
    void write () throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("d:/pqr.txt");
    }
}


public class ThrowsDemo {
    public static void main(String[] args) {
        ReadWrite readWrite = new ReadWrite();
        try {
            readWrite.read();
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
        try {
            readWrite.write();
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

}
