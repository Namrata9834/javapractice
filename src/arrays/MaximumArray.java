package arrays;

public class MaximumArray {
    public static void main(String[] args) {
        int array[]={10,20,5,40,90};
          int max=array[3];
           for (int i=0;i< array.length;i++){
               if(max<array[i]){
                   max=array[i];
               }
           }
        System.out.println("largest element of array "+max);

            }
}
