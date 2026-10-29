package PrefixSum;
//Range some Query from using prefixSum

public class UptowhichIndex {
    public static int findRange(int []arr,int l,int r) {
        int n = arr.length;

        int[] prefix = new int [n];
        prefix[0]= arr[0];

        for(int i=1;i<n;i++){
            prefix[i]= prefix[i-1]+arr[i];
        }
        //find Range
        int sum;

        if(l==0){
            sum = prefix[r];
        }
        else{
            sum= prefix[r]-prefix[l];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 1, 3, 6};
        int l=1,r=3;
        System.out.print(findRange(arr,l,r));
    }
    }


