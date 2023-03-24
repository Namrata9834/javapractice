package multi_threading;


public class SleepDemo{
    public void run(){
        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        SleepDemo s1= new SleepDemo();
       // s1.start();
    }

}
