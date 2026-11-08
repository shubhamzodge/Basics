package Multithreading;



public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread();
        thread_1 obj = new thread_1();
        obj.start();
        //obj.join();

        System.out.println("Good Morning");
    }
}
class thread_1 extends Thread{
        public void run(){
            try{
                Thread.sleep(5000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Good Evening");
        }
    }


