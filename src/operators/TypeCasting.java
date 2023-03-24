package operators;
 // implicit typecast - the compiler is responsible to perform this type casting. whenever we're assigning lower data type value to the
 //                        higher datatype variable  then implicit type cast will perform.


// explicit type casting : programmer is responsible for this type cast . higher data type is assigned to the lower data type
//
public class TypeCasting {
     public static void main(String[] args) {
         int x=10;
         double y = x;
         long  z=x;
         System.out.println(z);
         System.out.println(y);
         // implicit


         double f =100.000;
         int g= (int) f;
         System.out.println(g);
         // explicit


     }
}
