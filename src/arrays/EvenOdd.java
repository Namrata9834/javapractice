package arrays;

import thiskeyword.A;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter elements of arrays");
        int array[]=new int[8];
        for (int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("even elements");
      for (int i=0;i<array.length;i++){
          if(array[i]%2==0){
              System.out.print(array[i]+" ");
          }
      }
        System.out.println();
        System.out.println("odd elements");
        for (int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.print(array[i]+" ");
            }
        }



    }
}
