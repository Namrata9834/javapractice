package arrays;

public class AverageOfElements {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int length=a.length;
        int avg;
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("sum of elements are "+sum);
        avg=sum/length;
        System.out.println("avg of elements are "+avg);

    }
}
