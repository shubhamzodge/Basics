package HamshmapInternal;

import java.util.HashMap;
import java.util.LinkedHashMap;

//count freqency
public class Second {
    public static void main(String [] args){
        String str = "   Shubham Zodge  ";

        //for removing leading and traling space
       // str= str.trim();
        //for removing inbetween space
       // str= str.replace(" ","");
        str = str.replaceAll("\\s+","");

       HashMap<Character,Integer>map = new HashMap<Character,Integer>();
       // LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(char ch:str.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.print(map+" ");
    }

}
