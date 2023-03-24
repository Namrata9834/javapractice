package basic_programs;
// prime no is natural no which is divisible by one itself.

import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a no ");
        int no= sc.nextInt();
        int count=0;
        for (int i=1;i<=no;i++){
            if(no%i==0){
              count=count+1;
            }
        }
        if (count==2){
            System.out.println(no+" is prime no");
        } else {
            System.out.println(no+" is not prime no");
        }
    }
}
