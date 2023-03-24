package oops;
/*
Method Overriding is run time polymorphism in which method has same named and same return type but different class.
 */

    class Bank{
        public int rateOfInterest(){
            return 8;
        }
    }
    class Axis extends Bank{
        public int rateOfInterest(){
            return 9;
        }
    }
    class SBI extends Axis{
        public int rateOfInterest(){
            return 10;
        }
    }
class MethodOverridingEx {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("Bank rate of interest= "+ b.rateOfInterest());
        Axis a=new Axis();
        System.out.println("Axis rate of Interest= "+ a.rateOfInterest());
        SBI sbi= new SBI();
        System.out.println("SBI rate of interest= "+sbi.rateOfInterest());


    }

}