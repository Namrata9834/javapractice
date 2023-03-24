package operators;
// also called short circuit operator

public class LogicalOperator {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        int p=10;
        int q=20;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println( (10>=p) && (q>p));
        System.out.println((p>40 || (q>p)));

    }
}
