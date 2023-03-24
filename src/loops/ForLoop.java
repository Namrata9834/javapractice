package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        System.out.println(" enter the no's");
        Scanner sc = new Scanner(System.in);
        int no= sc.nextInt();
        for (int i=0;i<=no;i++) {
            System.out.print(i);
        }
        System.out.println("_________________");
    }
}



