package loops;
import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {
        System.out.println("Enter the element");
        Scanner sc= new Scanner(System.in);
        int element = sc.nextInt();
        for (int i=1;i<=element;i++){
            System.out.print(i);
            if(i==6){
                //break
                continue;
            }else {
                System.out.println(" welcome");
            }
        }
    }
}
