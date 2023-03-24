
package multi_threading;
class MyThread1 extends Thread{
    public void run(){
        System.out.println("playing video");
        System.out.print(currentThread().getPriority()+" ");
        System.out.print(currentThread().getName());
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println(" playing audio");
        System.out.print(currentThread().getPriority()+" ");
        System.out.println(currentThread().getName());
    }
}
class MyThread3 extends Thread{
    public void run(){
        System.out.println("playing progress bar");
        System.out.print(currentThread().getPriority()+" ");
        System.out.println(currentThread().getName());
    }
}
class MyThread4 extends Thread{
    public void run(){
        System.out.println("playing timer");
        System.out.print(currentThread().getPriority()+" ");
        System.out.println(currentThread().getName());
    }
}
class Test{
    public static void main(String[] args) {
        MyThread1 m1= new MyThread1();
        m1.setPriority(10);
        m1.setName("Thread1");
        m1.start();

        MyThread2 m2= new MyThread2();
        m2.setPriority(10);
        m2.setName("Thread2");
        m2.start();

        MyThread3 m3=new MyThread3();
        m3.setPriority(10);
        m3.setName("Thread3");
        m3.start();

        MyThread4 m4= new MyThread4();
        m4.setPriority(10);
        m4.setName("Thread4");
        m4.start();
    }
}