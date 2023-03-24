package oops.encapsulations;
class BankAccount{
    private int acc_no;
    private int amount;
    private String email;

  public void setAcc_no(int acc_no){
     this. acc_no=acc_no;
  }
  public int getAcc_no(){
      return acc_no;
  }
  public void setAmount(int amount){
      this.amount=amount;
  }
  public int getAmount(){
      return amount;
  }
  public void setEmail(String email){
      this.email=email;
  }
  public String getEmail(){
      return email;
  }


}
public class EncapsulationEx2 {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount();

        bankAccount.setAmount(1000);
        bankAccount.setEmail("namratatati11@gmail.com");
        bankAccount.setAcc_no(123456789);


        System.out.println(  bankAccount.getAcc_no());
        System.out.println(  bankAccount.getAmount());
        System.out.println(  bankAccount.getEmail());

    }
}
