package loops.flowcontrol.ifelse;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        System.out.println("enter a age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<19 && age>0){
            System.out.println(" dreamer stage");
        }
        else if (age>18 && age<36){
            System.out.println("explorer stage");
        }
        else if (age>37 && age<57 ){
            System.out.println("mentor stage");
        } else {
            System.out.println("giver stage");
        }
    }
}
