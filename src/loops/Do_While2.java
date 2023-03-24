package loops;

public class Do_While2 {
    public static void main(String[] args) {
//        int x=10;
//        int y=1;
//        do{
//            System.out.println(x*y);
//            y++;
//        } while (y<=10);

        int x=1;int sum=0;
        do{
            sum=sum+x;
            x++;
        } while (x<=10);
        System.out.println("sum of no's "+sum);

    }
}
