package arrays;

public class MaximumArray {
    public static void main(String[] args) {
        int a[]={10,20,40,100,60};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("maximum value of array element is "+max);
    }
}
