package arrays;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Enter an array");
        Scanner sc = new Scanner(System.in);
        int array[]=new int[5];
        for (int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

