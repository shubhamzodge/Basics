package Multithreading;

public class BusTicketBooking {
    public static void main(String[] args) throws seatsNotAvailableException {
        ticket3 tht1 = new ticket3();
        Thread t7 = new Thread(() -> {
            System.out.println("Booking 1");
            try {
                tht1.bookSeats("AlishA", 30);
            } catch (seatsNotAvailableException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t8 = new Thread(() -> {
            System.out.println("Booking 2");
            try {
                tht1.bookSeats("shubham", 4);
            } catch (seatsNotAvailableException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t9 = new Thread(() -> {
            System.out.println("Booking 3");
            try {
                tht1.bookSeats("Nitesh", 4);
            } catch (seatsNotAvailableException e) {
                throw new RuntimeException(e);
            }
        });
        t7.start();
        t8.start();
        t9.start();
    }
}

class ticket3 {
    int seats = 27;

    public void bookSeats(String str, int num) throws  seatsNotAvailableException {
        System.out.println("user arrived " + str + " wants to book " + num);

        if (seats > num){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            throw new seatsNotAvailableException("no SEATS");

        }

        System.out.println("seats avaliable booking seats: ");
        this.seats = this.seats-num;
        System.out.println("user: "+str+" Wants to book"+num );
        System.out.println("Remaining seats: "+ this.seats);
        }
    }

