package exception_handling;

public class Exception4 {
       void  divide(){
           int a= 100, b=0,c;
           c= a/b;
           System.out.println(c);
    }

    public static void main(String[] args) {
        Exception4 exception4 = new Exception4();
        try {
            exception4 .divide();
        } catch (ArithmeticException e){
           e.printStackTrace();
        }
        System.out.println(" hello");
    }
}
