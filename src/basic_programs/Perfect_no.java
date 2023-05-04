package basic_programs;
// Perfect no is a no which is equals to sum of its divisor ex 6,28


import java.util.Scanner;

public class Perfect_no {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int no = sc.nextInt();
       int sum=0;
       for (int i=1;i<no;i++){
           if(no%i==0){
               sum=sum+i;
           }
       }
       if(no==sum){
           System.out.println("the given no is perfect no");
       } else {
           System.out.println("the given no is not perfect no");
       }
    }
}
