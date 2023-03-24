package multi_threading;

public class SetNameDemo extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" : hello");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" : hello");

        SetNameDemo setNameDemo = new SetNameDemo();
        setNameDemo.setName("Nam");
        setNameDemo.start();
    }
}
