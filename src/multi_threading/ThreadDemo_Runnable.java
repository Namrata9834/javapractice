package multi_threading;

public class ThreadDemo_Runnable implements Runnable {
    public void run(){
        System.out.println(" Thread Task");
    }

    public static void main(String[] args) {
        ThreadDemo_Runnable tr= new ThreadDemo_Runnable();
        Thread t = new Thread(tr);
        t.start();
    }
    }

