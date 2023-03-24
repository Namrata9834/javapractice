package exception_handling;

public class Exception3 {
    public static void main(String[] args) {
      int a=10, b=0,c;
      try {
          c=a/b;
      } catch (ArithmeticException e){
          System.out.println(e);
      }
        System.out.println("hello");

    }
}
