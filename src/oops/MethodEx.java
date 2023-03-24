package oops;

import java.util.Scanner;

public class MethodEx {
    public static void main(String[] args) {
        System.out.println("Enter  a and b");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        myFunction(a,b);                         // actual arguments

    }
    public static void myFunction(int a,int b){    // formal arguments
        int sum= a+b;
         System.out.println("sum of a and b="+sum);
    }

}
