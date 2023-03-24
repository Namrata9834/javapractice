package arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,4,8};
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("minimum value of array element is "+min);
    }
}
