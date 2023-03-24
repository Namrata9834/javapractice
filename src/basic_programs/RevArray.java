package basic_programs;


import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
       int a[]= new int[10];
       Scanner sc= new Scanner(System.in);
        System.out.println(" enter elements of array");
        for (int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }

    }
}
