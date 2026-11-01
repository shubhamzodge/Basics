package General;

public class MoveZeros {
    public static int [] moving (int [] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
            }
        }
        return arr;


    }
    public static void main(String [] args){
        int [] arr ={1,0,2,0,0,9,8,7};
        int []result = moving(arr);
        for(int i=0;i< result.length;i++){
            System.out.print(result[i]+ " ");
        }
    }
}
