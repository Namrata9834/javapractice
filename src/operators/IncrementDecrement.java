package operators;

public class IncrementDecrement {
    public static void main(String[] args) {
//        int y = 10;

//        int x = y++ + (++y)+(y++);
//        System.out.println(x);

//        int x=9;
//        int b=10;
//        int z=(++x)+(++b)+(b++)+(x++);
//        System.out.println(z);

        int a = 10;
        int b = 20;
        int c = 40;

        int p= (++a)+(++b)-(c++)+(--c)-(a--);
        System.out.println(p);

    }
}
