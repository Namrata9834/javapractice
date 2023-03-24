package multi_threading;

public class GetNameDemo extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"  hello");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"  hii");
        GetNameDemo getNameDemo = new GetNameDemo();
        getNameDemo.start();
    }
}
