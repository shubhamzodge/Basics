package PrefixSum;
//largest element in array after merge operation(L-2789)

public class LargestElement {
    public static int maxElement(int [] arr){
        int currentSum = arr[arr.length-1];
        int maxSum = currentSum;

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<=currentSum){
                maxSum+=arr[i];
            }
            else{
                currentSum = arr[i];
            }
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String [] args){
        int [] arr ={2,3,7,9,3};
        System.out.print(maxElement(arr));
    }
}
