package PrefixSum;
import java.util.*;
public class Divisibe {


    //class Solution {
        public int subarraysDivByK(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();

            // Important: handles subarrays starting from index 0
            map.put(0, 1);

            int sum = 0;
            int count = 0;

            for (int num : nums) {
                sum += num;

                // Get remainder
                int rem = sum % k;

                // Handle negative remainder
                if (rem < 0) {
                    rem += k;
                }

                // If remainder seen before, add its frequency
                count += map.getOrDefault(rem, 0);

                // Update map
                map.put(rem, map.getOrDefault(rem, 0) + 1);
            }

            return count;
        }
    }

