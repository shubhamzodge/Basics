package PrefixSum;

public class Basics {
    public static void main(String [] args){
        int [] arr ={2,4,1,3,5};
        int n = arr.length;

        int [] prefix = new int [n];
        prefix[0]= arr[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
    }

}
