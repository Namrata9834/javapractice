package basic_programs;
// a no which is same when  reverse.


import java.util.Scanner;

public class Palindrome_no {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a no");
           int no= sc.nextInt();
           int temp=no;
           int sum=0;
           while (no>0){
              int rev=no%10;
               no=no/10;
               sum=sum*10+rev;
           }
           if(sum==temp){
               System.out.println(temp+" is palindrome noi");
           } else {
               System.out.println(temp+" is not palindrome no");
           }

        }
    }

