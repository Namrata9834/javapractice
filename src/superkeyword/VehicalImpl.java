package superkeyword;
class Vehical2{
    int vehicalCode;
    String vehicalType;
    public Vehical2(int vehicalCode,String vehicalType){
        this.vehicalCode=vehicalCode;
        this.vehicalType=vehicalType;
    }
}

class Bike extends Vehical2{
    String bikeName;
    String brand;
    String model;
    public Bike(int vehicalCode,String vehicalType, String bikeName ,String brand,String model){
        super(vehicalCode,vehicalType);
        this.bikeName=bikeName;
        this.brand=brand;
        this.model=model;
    }
    void display(){
        System.out.println("vehical code"+super.vehicalCode);
        System.out.println("vehical type: "+super.vehicalType);
        System.out.println("bike name :"+bikeName);
        System.out.println("Brand "+brand);
        System.out.println("model "+model);
    }
}
public class VehicalImpl {
    public static void main(String[] args) {
        Bike b= new Bike(101,"bike","splender","hero","12345C");
        b.display();

    }
}
