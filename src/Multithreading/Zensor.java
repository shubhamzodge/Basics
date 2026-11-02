package Multithreading;
//create 2 thread one thread is print even and one is print odd;
public class Zensor {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();

        obj.start();

        Demo2 obj2 = new Demo2();
        obj2.start();
    }
}
class Demo1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Even: "+i);
            }
        }
    }
}
class Demo2 extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2==1){
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Odd: "+i);
            }
        }
    }
}


