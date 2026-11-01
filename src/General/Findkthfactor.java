package General;
/*
Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
 */

public class Findkthfactor {
    public static int findFactor(int num,int k){
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                if(count ==k){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       // System.out.println(findFactor(12,3));
        System.out.println(findFactor(12,6));
    }
}
