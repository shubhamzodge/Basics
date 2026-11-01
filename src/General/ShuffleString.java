package General;

public class ShuffleString {
    public static String shuffle(String str,int [] arr){

        char[] result = new char[str.length()];
        for(int i=0;i<str.length();i++){
            result[arr[i]]=str.charAt(i);
        }
        return new String(result);

    }
    public static void main(String[] args){
        String str = "codeleet";
        int [] arr = {4,5,6,7,0,2,1,3};
        System.out.println(shuffle(str,arr));
    }
}

