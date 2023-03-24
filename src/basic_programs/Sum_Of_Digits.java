package basic_programs;
// no =123 sum=6

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println(" enter a no");
        int no= sc.nextInt();
        int sum=0;
        for (int i=0;i<=no;i++){
           sum=sum+i;
        }
        System.out.println(" sum of first 10 no's= "+sum);

    }
}
