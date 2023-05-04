package arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
       int a1[]=new int[]{10,20,30,40};
       int a2[]=new int[a1.length];
       for (int i=0;i< a1.length;i++){
           a2[i]=a1[i];
       }
       for (int i=0;i< a2.length;i++){
           System.out.print(a2[i]+" ");
       }
        System.out.println("................................");
      // copying in reverse order
        for (int i=a1.length-1;i>=0;i--){
            a2[i]=a1[i];
        }
           for(int i=a2.length-1;i>=0;i--){
               System.out.print(a2[i]+" ");

    }
       // System.out.println(Arrays.toString(a2));
    }

}