package loops;
// break is keyword which stops the executing of loop .
public class BreakEx {
    public static void main(String[] args) {
//        int i=1;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//            if(i==5){
//                break;
//            }
//        }
//        System.out.println("execution terminated");


        int x=10;
        while (x<=100){
            System.out.println(x);
            x+=10;
            if(x==50){
                break;
            }
        }
        System.out.println("execution terminated");
    }
}
