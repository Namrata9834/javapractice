package oops;
// Initialize variable using " ." operator

 class Plant{
     String size;
     String type;
 }
public class ObjectEx2 {
    public static void main(String[] args) {
        Plant p= new Plant();
        p.size="Big";
        p.type="Ashoka";
        System.out.println(p.size+" "+p.type);
    }
}
