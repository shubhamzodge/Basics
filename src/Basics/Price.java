package Basics;
import java.util.*;
public class Price {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        try{
            int hours = sc.nextInt();
            int totalFee=0;

            if(hours<=2){
                totalFee= hours*100;
            }
            else if(hours<=5){
                totalFee= 200+(hours-2)*50;
            }else if(hours>5){
                totalFee= 200+150+(hours-5)*20;
            }
            System.out.println(totalFee);
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
