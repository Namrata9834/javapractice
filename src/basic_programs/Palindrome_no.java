package basic_programs;
// a no which is same when  reverse.


import java.util.Scanner;

public class Palindrome_no {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println(" enter a no");
            int no= sc.nextInt();
            int rev, sum=0;
            int temp=no;
            while (no>0){
                rev=no%10;
                no=no/10;
                sum=sum*10+rev;
            }
            if(temp==sum){
                System.out.println(temp+" is palindrome no");
            } else {
                System.out.println(temp+" is not palindrome no");
            }

        }
    }

