package General;

public class LargestElement2 {
    public static int findLargest(int [] arr){
        if(arr==null || arr.length==0){
            throw new  IllegalArgumentException("array is Empty or null");
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String [] args){
        int [] arr={34,12,78,45,90,23};
        System.out.println("Largest element among array is "+findLargest(arr));
    }
}
