package operators;

public class ConditionalOperator {
    public static void main(String[] args) {
//        int x=(10>20)?30:40;
//        System.out.println("maximum value = "+x);

        int x=(10>20)?30:((40>50)?40:70);
        System.out.println(x);
    }
}
