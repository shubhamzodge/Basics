package Multithreading;

public class Join2 {
    public static void main(String[] args) throws InterruptedException {
        Thread_2 obj = new Thread_2();
        obj.start();
        obj.join();
        System.out.println("Good Morning");
    }
}
class Thread_2 extends Thread{
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Good Night");
    }
}
