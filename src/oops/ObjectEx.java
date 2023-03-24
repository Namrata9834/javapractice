package oops;
class Animal{
    String color;
    int age;
    void method(String color, int age){
       this. color=color;
       this. age=age;
    }
    void display(){
       System.out.println("color= "+color+" "+"age="+age);
    }
}
public class ObjectEx {
    public static void main(String[] args) {
        Animal aa= new Animal();
        aa.method("black",2);
        aa.display();

    }
}
