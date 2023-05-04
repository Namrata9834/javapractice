package basic_programs;


import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int array[]=new int[5];
        System.out.println("Enter the elements of array");
       for (int i=0;i< array.length;i++){
           array[i]= sc.nextInt();
       }
       for (int i= array.length-1;i>=0;i--){
           System.out.print(array[i]+" ");
       }

    }
}
