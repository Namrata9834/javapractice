package exception_handling;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
    YoungerAgeException( String msg){
        super(msg);
    }
}

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter age");
        int age= sc.nextInt();
        if(age<18){
            throw new YoungerAgeException(" you are not eligible for voting");
        } else {
            System.out.println(" You can Vote");
        }
        System.out.println(" hiii");
    }

}
