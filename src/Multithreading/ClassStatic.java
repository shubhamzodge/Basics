package Multithreading;

public class ClassStatic {
    public static void main(String[] args) throws InterruptedException {


        Temperature t = new Temperature();
        Temperature ta = new Temperature();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <=10000; i++) {
                t.increase();
            }
        });
        Thread t12 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                ta.increase();
            }
        });
        t1.start();
        t12.start();
        t1.join();
        t12.join();
        System.out.println(t.temp);
        System.out.println(ta.temp);


    }
}
class Temperature{
     static int temp=0;
    public static void increase(){
        synchronized (Temperature.class) {

            temp++;
        }

    }
}
