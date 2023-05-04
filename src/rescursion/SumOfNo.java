package rescursion;

public class SumOfNo {
    public static void printNum( ) {
        int sum=0;
        for (int i=1;i<=5;i++){

            sum=sum+i;

        }

        System.out.println(sum);

    }
    public static void main(String[] args) {
      printNum();
    }
}
