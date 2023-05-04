package arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={10,200,68,90,156};
         int max=arr[0];
         for (int i=0;i< arr.length;i++){
             if(max<arr[i]){
                 max=arr[i];
             }
         }
        System.out.println(max+" Largest element of array ");
              }

}

