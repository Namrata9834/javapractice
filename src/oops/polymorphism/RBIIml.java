package oops.polymorphism;
class RBI{
    float rateOfInterest(){
        return 7;
    }
}
class SBI extends RBI{
    float rateOfInterest(){
        return 9;
    }
}
class Axis extends RBI{
    float rateOfInterest(){
        return 6;
    }
}
public class RBIIml {
    public static void main(String[] args) {
        RBI rbi;                                      // reference variable
        rbi = new Axis();
        System.out.println(rbi.rateOfInterest());

        rbi= new SBI();
        System.out.println(rbi.rateOfInterest());




    }
}