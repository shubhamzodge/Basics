package PrefixSum;
import java.util.*;
//count num of subarray whose sum equals to target;
public class SubarraySum {
    public static int subArraySum(int [] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int currentSum =0;
        int count =0;

        for(int num:nums){
            currentSum+=num;

            if(map.containsKey(currentSum-target)){
                count+=map.get(currentSum-target);
            }
            map.put(currentSum, map.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
    public static void main(String [] args){
        int nums[]={1,1,1};
        int target = 2;
        System.out.println(subArraySum(nums,target));
    }
}
