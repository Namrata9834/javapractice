package basic_programs;
// The adding of two nos in a series is called as FS.


import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
          int no= sc.nextInt();
          int p=0,c=1,nxt=0;
          for (int i=1;i<=no;i++){
              System.out.println(nxt);
              nxt=p+c;
              p=c;
              c=nxt;
          }

    }
}
