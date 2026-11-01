package General;
import java.util.*;

public class Prime3 {
    public static void main(String [] args){
        int count =0;
        for(int i=1;i<=50;i++){

            if(i<=1){
                continue;
            }
            boolean isPrime = true;

            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime = false;
                   // count++;
                    break;
                }
            }
            if(isPrime){
                count++;
            }

        }
        System.out.print(count);
    }
    }

