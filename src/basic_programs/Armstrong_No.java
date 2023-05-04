package basic_programs;
// the sum of cube of each digit is called as armstrong no;

import java.util.Scanner;

public class Armstrong_No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int no=sc.nextInt();
        int temp=no;
        int rev,sum=0;
        while (no>0){
           rev=no%10;
            sum=sum+(rev*rev*rev);
           no=no/10;

        }
        if(temp==sum){
            System.out.println(temp+" is armstrong no");
        } else
            System.out.println(temp+" is not armstrong no");
    }
}

