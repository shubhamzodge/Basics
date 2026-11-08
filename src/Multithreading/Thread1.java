package Multithreading;

public class Thread1 {
    public static void main(String[] args) {
        //Demo e
    }
}
class Demo {
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
