package oops.inheritance;
/*
  Single inheritance
  bankno and ifscode
  address branchcode
 */
  class Bank{
      int bankNO;
      String ifsCode;
     }
     class SBI extends Bank{
      String address;
      String branchCode;
      void display(){
          System.out.println("Bank no= "+bankNO);
          System.out.println("ifscosde= "+ifsCode);
          System.out.println("address= "+address);
          System.out.println("Branch no= "+branchCode);
      }
     }
class BankIml {
    public static void main(String[] args) {
        SBI sbi= new SBI();
        sbi.bankNO=123456;
        sbi.ifsCode="98765432987";
        sbi.address="pune , maharashtra";
        sbi.branchCode="123#";
        sbi.display();

    }
}
