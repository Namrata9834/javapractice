package exception_handling;

public class MultipleCatchDemo {
    public static void main(String[] args) {

     try {
         int a[]= new int[7];
        // System.out.println(a[10]);
         a[5]=90/0;
     }
     catch (ArrayIndexOutOfBoundsException e){
         System.out.println(e);
     }
     catch (ArithmeticException ea){
         System.out.println(ea);
     }
     finally {
         System.out.println("No error");
     }

    }
}