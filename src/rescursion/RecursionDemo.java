package rescursion;

public class RecursionDemo {
    static int count=0;
       static void printHello(){
         count++;
         if(count<=5){
             System.out.println("Hello world...!");
             printHello();
         }
     }
    public static void main(String[] args) {
       printHello();
      //  RecursionDemo rr= new RecursionDemo();  ... if we does not declare as static function and variable
       // rr.printHello();
    }
}