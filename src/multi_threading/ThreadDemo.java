package multi_threading;

public class ThreadDemo extends Thread{
   public void run(){
        System.out.println(" Thread Task");
    }

    public static void main(String[] args) {
        ThreadDemo td= new ThreadDemo();    // thread1
        td.start();
        ThreadDemo td1= new ThreadDemo();   // thread2
        td1.start();
    }

}
