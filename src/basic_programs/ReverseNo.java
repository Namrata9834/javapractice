package basic_programs;
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int no= sc.nextInt();
        int temp=0,sum=0;
        int rev;
        while (no>0){
            rev=no%10;
            no=no/10;
            sum=sum*10+rev;
        }
        System.out.println(sum);
    }
}
