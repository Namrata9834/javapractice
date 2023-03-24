package exception_handling;

public class FinallyDemo {
    public static void main(String[] args) {
        int a=100, b=20,c;
        try {
            c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println(" No Exception");
        }
    }
}
// if b=0 it will enter in catch block
