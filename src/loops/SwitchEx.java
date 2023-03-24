package loops;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age= sc.nextInt();
        switch(age){
            case 20:
                System.out.println("dreamer age");
                break;
            case 30 :
                System.out.println("Explorer age");
                break;
            case  50 :
                System.out.println("Mentor age");
                break;
            default:
                System.out.println("please enter a valid age");
        }

    }
}