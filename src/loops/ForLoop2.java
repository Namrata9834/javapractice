package loops;
import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age<10){
            for (int x=1;x<4;x++){
                System.out.println(age+" is too young");
                System.out.println(" enter userAge");
                int userAge= sc.nextInt();
                System.out.println(userAge);
            }
        }else {
            System.out.println(" welcome");
        }
    }
}
