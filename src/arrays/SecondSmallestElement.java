package arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int a[]={40,8,90,34,66,84};
        int temp;
         for (int i=0;i<a.length;i++){
             for (int j=i+1;j<a.length;j++){
                 if(a[i]>a[j]){
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                 }
             }
         }
        System.out.print("sorted elements of array : ");
         for (int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
         }
        System.out.println("");
        System.out.print("second smallest element is : "+a[1]);


        }
    }

