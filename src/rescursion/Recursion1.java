package rescursion;

public class Recursion1 {
   static void printNumber(int num){
        if(num<=5){
            System.out.println(num);
            num=num+1;
            printNumber(num);
        }
   }
    public static void main(String[] args) {
        printNumber(1);
    }

}
// print number 5 to 1