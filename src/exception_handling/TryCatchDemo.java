package exception_handling;


public class TryCatchDemo {
    void errorMethod(){
        int a=10;
        int b= a/0;
        System.out.println(b);
    }
    public static void main(String[] args) {
        TryCatchDemo tryCatchDemo = new TryCatchDemo();
        try {
            tryCatchDemo.errorMethod();
        } catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println(" No error");
        }
    }
}
