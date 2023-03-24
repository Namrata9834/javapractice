package oops.inheritance;


class Phone {
    void name() {
        System.out.println("SAMSUNG");
    }
    void price(){
        System.out.println("20k");
    }

    void on() {
        System.out.println("Turning on SAMSUNG");
    }
}


;
class SmartPhone extends Phone {
    void name() {
        System.out.println("APPLE");
    }

    void on() {
        System.out.println("Turning on APPLE");
    }
}

    public class DynamicMethodDispatch {
        public static void main(String[] args) {
        Phone obj = new SmartPhone();       // this is dynamic method dispatch or run time
                                               // polymorphism(creating object at runtime)
            obj.price();
        obj.on();
        obj.name();

    }
}
