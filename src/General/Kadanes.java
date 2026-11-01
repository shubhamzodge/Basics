package General;
import java.util.*;
//use to find maximum sum of subarray;

public class Kadanes {
   public static int maxSum(int [] arr){
       int maxSum = arr[0];
       int sum = arr[0];
       for(int i=1;i<arr.length;i++){
           if(sum>=0){
               sum+= arr[i];
           }
           else{
               sum = arr[i];
           }
           if(sum>maxSum){
               maxSum = sum;
           }
       }
       return maxSum;
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int [size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int result = maxSum(arr);
        System.out.println("maximum sum of subarray is "+result);
    }
}
