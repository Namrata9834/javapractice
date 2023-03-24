package oops.polymorphism;

public class PolymorphismEx2 {
    void sub(int a,int b,int c){
        System.out.println(" sum of three="+(a+b+c));
    }
    void sub(float a,float b,float c){
        System.out.println(" sum of three diff types ="+(a+b+c));
    }
    public static void main(String[] args) {
        PolymorphismEx2 polymorphismEx2 = new PolymorphismEx2();
        polymorphismEx2.sub(10,20,30);
     //  polymorphismEx2.sub((int) 0.1,8.6,2.3);

    }
}
