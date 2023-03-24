package oops.inheritance;
class A{
    void showA(){
        System.out.println(" I am class A");
    }
}
class B extends  A{
    void showB(){
        System.out.println(" I am class B");
    }
}
class C extends B{
    void showC(){
        System.out.println(" I am class C");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
         C cc = new C();
         cc.showC();
         cc.showA();
         cc.showB();
    }
}
