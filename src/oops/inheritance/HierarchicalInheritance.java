package oops.inheritance;
class  One{
    void displayOne(){
        System.out.println(" I am One class method");
    }
}
class Two extends One{
    void displayTwo(){
        System.out.println(" I am Two class method");
    }
}
class Three extends One{
    void displayThree(){
        System.out.println(" I am Three class method");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
         One one = new One();
         one.displayOne();
        System.out.println("__________________");
         Two two = new Two();
         two.displayTwo();
         two.displayOne();
        System.out.println("__________________");
         Three three= new Three();
         three.displayThree();
         three.displayOne();
    }
}
