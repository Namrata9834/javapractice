package interfaces;
  interface I11{
     public void show();
}
interface I22 {
    public void display();
}
class MultipleInheritance implements I11,I22{
      @Override
    public void show(){
        System.out.println(" in show method");
    }

    @Override
    public void display() {
        System.out.println(" in display method");

    }
}
public interface InterfaceEx2_Multiple_Inheritance {
    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.display();
        mi.show();
    }
}
