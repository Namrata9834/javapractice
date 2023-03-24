package multi_threading;

public class ThreadPriorities  extends Thread{
     public void run(){
         System.out.println(currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println(currentThread().getPriority());
        ThreadPriorities tr=new ThreadPriorities();
        tr.setPriority(10);
        tr.start();
    }
}
