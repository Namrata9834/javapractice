package basic_programs;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int no=sc.nextInt();
        if(no%2==0){
            System.out.println("The entered no is even no");
        } else {
            System.out.println("The entered no is odd no");
        }
    }
}
