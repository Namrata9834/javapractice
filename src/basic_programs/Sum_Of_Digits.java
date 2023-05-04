package basic_programs;
// no =123 sum=6

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        int sum=0;
        int no=10;
        for (int i=1;i<=10;i++){
           sum=sum+i;
        }
        System.out.println(sum);
    }
}

