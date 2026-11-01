package General;

import java.util.Scanner;

public class Fake {
   // package General;
//import java.util.*;
//check whether given num is prime or not

    public class Prime {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a prime number: ");
            int n = sc.nextInt();

            if(n<=1){
                System.out.println(n+ " is not a prime number");
                return ;
            }
            boolean isPrime = true;

            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n +" is a Prime number");
            } else{
                System.out.println(n + " is Not a prime number");
            }
        }
    }

}
