package Multithreading;

import java.util.ArrayList;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        DemoT1 obj = new DemoT1();
        obj.demoThread();
    }
}
    class DemoT1 {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        public void demoThread() {
            while (true) {
                if (arr.size() >= 5) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Remove Element: " + arr.remove(0));
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Adding Element:::");
                    arr.add(25);
                }
            }
        }
    }
