package Basics;
import java.util.*;

public class Gym {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month<=0){
            System.out.println("Invalid element");
        }
        else if(month==1){
            System.out.println("Rs 2000");
        }
        else if(month<=3){
            System.out.println("5000");
        }
       else if(month<=6){
           System.out.println("9000");

        }
       else if(month>6){
           System.out.println("15000");
        }
    }
}
