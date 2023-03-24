package oops.abstraction;


 abstract class Vehical{
    abstract void start();

}
class Car extends  Vehical{
     void start(){
         System.out.println(" car start with key");
     }
}
class Scooter extends Car{
     void start(){
         System.out.println(" Scooter start with kick");
     }
}
public class AbstractionEx1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();

        Scooter sc= new Scooter();
        sc.start();
    }
}
