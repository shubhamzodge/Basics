//import java.util.HashSet;
import java.util.*;
public class CheckDuplicates {
  public static boolean isDuplicates(int [] arr){
      HashSet<Integer>set= new HashSet<>();
      for(int i=0;i<arr.length;i++){
          set.add(arr[i]);
          if(set.contains(arr[i])){
              return true;
          }
      }
      return false;
  }

    public static void main(String[] args) {
        int [] arr={1,2,2,3,3,4,5};
        System.out.println(isDuplicates(arr));
    }

}
