package General;
//common factors of two numbers sum
//the common factors of 12 and 6 are 1, 2, 3, 6.: o/p=4
//12=1,2,3,4,6,12  && 6= 1,2,3,6

public class FactorsSum {

      public static int counting (int a,int b){
          int count =0;
          for(int i=1;i<=Math.min(a,b);i++){
              if(a%i==0 && b%i==0){
                  count++;
              }
          }
          return count;

      }
      public static void main(String []args){
          System.out.print(counting(6,12));
      }
    /*
    public List<Integer> commonFactors(int a,int b){
    List<Integer>result = new ArrayList<>();
    for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
            result.add(i);
            }
            }
            return result;

         //start

         public static int isCommon(int a,int b){
        int count =0;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
     */


}
