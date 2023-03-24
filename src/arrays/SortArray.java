package arrays;

public class SortArray {
    public static void main(String[] args) {
        int a[]={10,20,80,75,34,90};
        int temp;
        for (int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
            System.out.print("sorted elements of array ");
            for (int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }

    }
}
