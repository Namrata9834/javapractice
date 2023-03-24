package arrays;

import thiskeyword.A;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the elements of array");
        int a[]= new int[5];
        for (int i=0;i< a.length;i++){
            a[i]= sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("even no "+a[i]);
            } else {
                System.out.println("Odd no "+a[i]);
            }
        }




    }
}
