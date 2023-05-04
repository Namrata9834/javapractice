package arrays;

public class MinimumArray {
    public static void main(String[] args) {
       int a[]={90,7,88,34,45,2,56};
       int min=a[0];
       for (int i=0;i<a.length;i++){
           if(a[i]<min){
               min=a[i];
           }
       }
        System.out.println("smallest element of array is "+min);
    }
}
