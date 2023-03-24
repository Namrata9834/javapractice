package exception_handling;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("going to divide by 0");
                int b=30/0;
                System.out.println(b);
            } catch (ArithmeticException e){
                System.out.println(e);
            }

            try {
                int a[] = new  int[10];
                System.out.println(a[10]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        } catch (Exception e){
            System.out.println(" outer catch block is executed");
        }
        finally {
            System.out.println(" No error");
        }
    }
}
