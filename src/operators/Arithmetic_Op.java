package operators;

public class Arithmetic_Op {
    public static void main(String[] args) {
        int a=4;
        int b=6+a;
        int c= 6%a;  // modulo operator
        System.out.println(b);
        System.out.println(c);
        System.out.println("_____________");

        c*=3;                       // assignment op
        a%=6;
        System.out.println(a);
        System.out.println(c);
        System.out.println(b==c);
        System.out.println(65>98);      // comparison op
        System.out.println(67!=90);
        System.out.println(89<78);
        System.out.println("_____________");

        boolean a1= true;
        boolean a2= false;
        System.out.println(a1&& a2);
        System.out.println(a1| a2);
        System.out.println(89>=909 && 90>=90);
        System.out.println(89>=909 || 90>=90);
        System.out.println(!true);
        System.out.println(!!true);
        System.out.println(!false);
        System.out.println(!!false);
        System.out.println("_____________");


        int x=9;
        int y=10;
        int z=1;

        x= ++x + ++y + z + x++ + y++ + ++z;     // increment and decrement op
        //x= 10+11+1+10+11+2
        System.out.println(x);
        y= ++y  -  --x  * ++z - y-- + z++ ;
      // y= (12-44)*(3-12+3)
        System.out.println(y);



    }
}
