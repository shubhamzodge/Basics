package Multithreading;

public class TicketBooking {
    public static void main(String[] args) {
        Theater tht = new Theater();
        tht.bookSet("Alisha",4);
        System.out.println("-------------");
        tht.bookSet("Nitesh",4);
        System.out.println("-------------");
        tht.bookSet("shubham",4);

    }
}
class Theater{
    int seats =10;
    public void bookSet(String str,int num){
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
