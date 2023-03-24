package oops.abstraction;
abstract class Vehical1{
    abstract void start();
    Vehical1(){
        System.out.println(" in vehical constructor");
    }
    final void stop(){
        System.out.println(" in stop method");
    }
    static   void show(){
        System.out.println(" in show method");
    }
    void drive(){
        System.out.println(" in drive method");
    }
}
class Car1 extends Vehical1{
    Car1(){
        super();
    }
    void start(){
        System.out.println(" in car start method");
    }
    void drive(){
        super.drive();
    }
}
public class VehicalImpl {
    public static void main(String[] args) {
        Vehical1 v1= new Car1();
        v1.start();
        v1.drive();
        v1.stop();
    }
}
