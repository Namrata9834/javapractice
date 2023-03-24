package arrays;

public class CopyArray {
    public static void main(String[] args) {
       int array1[]= new int[]{10,20,30,40,50};
       int array2[]=new int[array1.length];
       for (int i=0;i< array1.length;i++){
           array2[i]=array1[i];
       }
       for (int i=0;i< array2.length;i++){
           System.out.print(array2[i]+" ");
       }
    }
    }

