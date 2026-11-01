package General;
import java.util.*;
//check whether given num is prime or not

public class Prime {
   public static void main(String [] args){
       int num = 29;
       if(num<=1){
           System.out.println(num +" is not a prime ");
       }
       boolean isPrime = true;
       for(int i=2;i<Math.sqrt(num);i++){
           if(num%i==0){
               isPrime= false;
               break;
           }
       }
       if(isPrime){
           System.out.println(num +" is a prime number");
       }
       else{
           System.out.println(num +" is not a prime number");
       }
   }
}
