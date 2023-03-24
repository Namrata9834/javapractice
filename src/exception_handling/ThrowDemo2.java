package exception_handling;

import java.util.Scanner;

public class ThrowDemo2 {
    public static void main(String[] args) {
       int age ;
        System.out.println(" enter age");
        Scanner sc = new Scanner(System.in);
        try{
            validAge(22);
        }  catch (YoungerAgeException e){
            System.out.println(e.getMessage());
        }

    }
     public static void validAge(int age){
        if(age> 18 || age<55){
            throw new YoungerAgeException(" You can vote");
        } else {
            System.out.println(" You can't vote");
        }
    }
}
