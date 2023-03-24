package interfaces;
interface  I1{
    public  void show();

    }

class Test implements I1{

    public void show(){
        System.out.println(" ONE");

    }

}
public interface InterfaceEx1 {
    public static void main(String[] args) {

        Test t = new Test();
        t.show();
    }
}
