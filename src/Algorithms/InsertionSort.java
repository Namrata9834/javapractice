package Algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
     int a1[]={5,1,6,2,3,4};
     for (int i=1;i< a1.length;i++){
         int temp=a1[i];
         int j=i;
         while (j>0 && temp<a1[j-1]){
             a1[j]=a1[j-1];
             j=j-1;
         }
         a1[j]=temp;
     }
        System.out.println(Arrays.toString(a1));


    }
}
