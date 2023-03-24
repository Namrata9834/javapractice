package oops;
/*
Method OverLoading is compiled time polymorphism in which two or more method have same named , but different
parameter or no of parameters.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading methodOverloading= new MethodOverloading();
        methodOverloading.myFunction(10,20,30);
        methodOverloading.myFunction(10,90);
        methodOverloading.myFunction(10,20,70);
    }
    public void myFunction(int a,int b,int c){
        System.out.println("sum of a ,b and c= "+(a+b+c));
    }
    public void myFunction(int a,int b){
        System.out.println("sum of a and b ="+(a+b));
    }
}