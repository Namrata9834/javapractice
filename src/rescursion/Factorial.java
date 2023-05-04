package rescursion;

public class Factorial {
    public static int printFactorial(int n){
        if (n==1 || n==0){
            return 1;
        }
      int fact=  printFactorial(n-1);
      int fact_num=n*fact;
      return fact_num;
    }
    public static void main(String[] args) {
        int n=5;
        int ans= printFactorial(n);
        System.out.println(ans);
    }
}
