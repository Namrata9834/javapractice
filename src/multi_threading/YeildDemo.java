package multi_threading;

public class YeildDemo extends Thread {
    public static void main(String[] args) {
        YeildDemo yy= new YeildDemo();
        yy.start();
        for (int i=1;i<=10;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }


    public void run() {
        for (int i = 1; i <= 10; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}