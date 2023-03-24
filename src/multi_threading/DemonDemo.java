package multi_threading;

public class DemonDemo extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Child Thread");
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");
        DemonDemo dd= new DemonDemo();
         // dd.setDaemon(true);
          dd.start();
    }
}
