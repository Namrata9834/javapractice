package arrays;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[]=new int[5];
        for (int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        int min=array[0];
        for (int i=0;i< array.length;i++){
            if(array[0]>array[i]){
                min=array[i];
            }
        }
        System.out.println("minimum value of array "+min);

       }


}
