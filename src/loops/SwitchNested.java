package loops;

import java.util.Scanner;

public class SwitchNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id and department of employee");
        int id= sc.nextInt();
        String dept= sc.next();
        switch (id){
            case 1 :
                System.out.println("use another id");
                break;
            case 2 :
                switch (dept){
                    case "hr":
                        System.out.println("the employee works under the hr team");
                        break;
                    case "fi":
                        System.out.println("the employee works under the finance department");
                        break;

                    default:
                        System.out.println("enter a valid department");
                }
            default:
                System.out.println("Enter a valid id");

        }

    }
}
