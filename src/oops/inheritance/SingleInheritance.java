package oops.inheritance;
class Fruits{
    void display(){
        System.out.println("fruits are healthy for us");
    }
}
class Orange extends Fruits{
    void display(){
        System.out.println("Oranges contains vitamins");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
         Fruits fruits= new Orange();
         fruits.display();

    }

}
