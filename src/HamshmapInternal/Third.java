package HamshmapInternal;
//count occarance of words

import java.util.HashMap;

public class Third {
    public static void main(String [ ]args){
        String str="The Sky is Beautiful Rain is Also The  Beautiful";
        HashMap<String,Integer> map = new HashMap<String ,Integer>();
       // str = str.replaceAll("[ ,]","");
        String [] arr = str.split(" ");
//        for(String s:arr){
//            System.out.println(s);
//        }
        for(String str1:arr){
            map.put(str1,map.getOrDefault(str1,0)+1);
        }
        System.out.println(map);

    }
}
