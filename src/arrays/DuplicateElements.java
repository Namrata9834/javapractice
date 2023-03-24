package arrays;

public class DuplicateElements {
    public static void main(String[] args) {
     int array[]= {10,20,10,30,20,70,30};
        System.out.println("duplicate elements of array ");
     for (int i=0;i<array.length;i++){
         for (int j=i+1;j< array.length;j++){
             if(array[i]==array[j] && i!=j ){
                 System.out.println(array[i]);
             }
         }
     }

    }
}
