package loops.flowcontrol.ifelse;

import java.util.Scanner;

public class IFElse {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no==10){
            System.out.println("the no is valid");
        } else {
            System.out.println("the no is invalid");
        }

}
}