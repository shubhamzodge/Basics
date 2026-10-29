package PrefixSum;
//pivot --> leftSum == rightSum
public class PrefixSum {
    public static int pivotIndex(int [] arr){
        int totalSum=0;

        for(int num:arr){
            totalSum+=num;
        }
        int leftSum =0;
        //traverse and check pivot
        for(int i=0;i<arr.length;i++){
            int rightSum = totalSum-leftSum-arr[i];

            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int [] arr ={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
