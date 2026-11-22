package Multithreading;

public class TicketBooking2 {
    public static void main(String[] args) {
        Theater2 tht = new Theater2();
        Thread t1 = new Thread(() -> {
            System.out.println("Booking 1");
            tht.bookSet("AlishA", 4);
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Booking 2");
            tht.bookSet("shubham", 4);
        });
        Thread t3 = new Thread(() -> {
            System.out.println("Booking 3");
            tht.bookSet("Nitesh", 4);
        });
        t1.start();
        t2.start();
        t3.start();

    }
}
class Theater2{
    int seats =10;
    public synchronized void bookSet(String str,int num){
        System.out.println("user Arrived: "+str+" Wants to book: "+num);
        if(seats>num){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("seats avaliable booking seats: ");
            this.seats = this.seats-num;
            System.out.println("user: "+str+" Wants to book"+num );
            System.out.println("Remaining seats: "+ this.seats);
        }
        else{
            System.out.println("available not enough seats");
        }
    }
}