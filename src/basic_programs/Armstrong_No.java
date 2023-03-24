package basic_programs;
// the sum of cube of each digit is called as armstrong no;

import java.util.Scanner;

public class Armstrong_No {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter a no");
        int no= sc.nextInt();
        int rev,sum=0;
        int temp=no;
        while (no>0){
            rev = no%10;
            no  = no/10;
            sum = sum+rev*rev*rev;
        }
        if(temp==sum)
            System.out.println(temp+" is armstrong no");
        else
            System.out.println(temp+" is not armstrong no");
    }
}

