package oops.inheritance;

import java.util.Scanner;

class First{
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a");
        a= sc.nextInt();
        System.out.println(" Enter b");
        b= sc.nextInt();
    }



}
class Second extends First{
    void add(){
        System.out.println("Addition= "+(a+b));
    }
}
class  Third extends Second{
    void sub(){
        System.out.println("Subtraction ="+(a-b));
    }
}

public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Third third= new Third();
        third.input();
        third.add();
        third.sub();
    }
}
