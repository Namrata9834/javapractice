package arrays;

public class KeyFound {
    public static void main(String[] args) {
        int a[]={5,6,7,8,9,10};
        int max=a[2];
        for (int i=0;i<a.length;i++){
            if(a[i]==a[2]){
                System.out.println(a[i]+" key is found at index "+i);



            }
        }


    }
}
