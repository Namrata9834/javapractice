package arrays;

public class MinimumArray {
    public static void main(String[] args) {
        int a[]={30,10,2,90,8,7};
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("minimum value of array element is "+min);
    }
}
