package oops.polymorphism;
 class Addition{
    int add (int no1,int no2){
        return no1+no2;
    }
    int add(int no1,int no2,int no3){
        return no1+no2+no3;
    }
    float add(float no1,float no2,float no3){
        return no1+no2+no3;
    }
    float add(float no1,float no2){
        return no1+no2;
    }
    void add(){
        System.out.println(" calling var arguments");
    }

}
 public class AdditionIml {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add();
        System.out.println( addition.add(6,8,8));
        System.out.println( addition.add(7f,8f,10f));
        System.out.println( addition.add(7.8f,90f));
        System.out.println(  addition.add(56,8));

    }
}
