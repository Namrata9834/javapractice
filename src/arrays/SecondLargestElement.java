package arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int a[] = {10, 30, 70, 40, 60, 22};
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("sorted elements of array");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("second largest element of array ");
        System.out.print(a[1]);
    }
}
