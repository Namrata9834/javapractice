package arrays;

public class LargestElement {
    public static void main(String[] args) {
        int a[]={10,20,30,90,40};
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("maximum value of array element is  "+max);
    }
}
