package oops.polymorphism;

public class RunTimePolymorphismEx {
    void add(int a, int b){
        System.out.println(" Addition of a and b in parent class : "+(a+b));
    }
}
class Overriding extends RunTimePolymorphismEx{
    void add(int a,int b,int c){
        System.out.println(" Addition of a and b and c child class : "+(a+b+c));
    }

    public static void main(String[] args) {
//        RunTimePolymorphismEx = new RunTimePolymorphismEx();
//        runTimePolymorphismEx.add(10,20);
        Overriding overriding = new Overriding();
        overriding.add(10,20);
        overriding.add(10,20,30);
    }
}