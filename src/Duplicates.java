//remove duplicates from sorted array
public class Duplicates {
    public static int isDuplicates(int [] arr){
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]= arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int [] arr = {11,12,12,13,14,14,15};
        int newLen= isDuplicates(arr);

        for(int i=0;i<newLen;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
