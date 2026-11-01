package General;
import java.util.*;
//from 1 to N

public class Prime2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}