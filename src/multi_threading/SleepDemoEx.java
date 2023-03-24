package multi_threading;

public class SleepDemoEx extends Thread {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        SleepDemo sleepDemo = new SleepDemo();
       // sleepDemo.start();
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }

    }
}
