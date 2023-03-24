package superkeyword;
/*
  1. used to refer immediate parent class instance variable
 */

class SuperDemo{
    String name="Elephant";
    void display(){
        System.out.println("this is all about super and this keyword");
    }
}
class SuperDemo2 extends SuperDemo{
    void show(){
        System.out.println(super.name);
        System.out.println(this.name);
        super.display();
        this.function();
    }
    void function(){
        System.out.println("this is all about current class method");
    }
    String name = "Lion";
}
public class AImpl {
    public static void main(String[] args) {
        SuperDemo2 superDemo2 = new SuperDemo2();
        superDemo2.show();

    }
}
