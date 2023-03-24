package exception_handling;

public class ExceptionMethod {
    public static void main(String[] args) {
        int a=100, b=0,c;
        try {
            c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
         //   System.out.println(e.printStackTrace());
        }
    }
}
