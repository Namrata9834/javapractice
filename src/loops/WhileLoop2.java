package loops;

public class WhileLoop2 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println("sum of first 10 no's are "+sum);
    }
}
