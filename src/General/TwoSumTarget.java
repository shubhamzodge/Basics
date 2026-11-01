package General;
// optimised;

public class TwoSumTarget {
  public static int []findTarget(int []nums,int target){
      int i=0,j=nums.length-1;
      while(i<j){
          int sum = nums[i]+nums[j];
          if(sum>target){
              j--;
          }
          else if(sum<target){
              i++;
          }
          else{
              return new int []{i+1,j+1};
          }
      }
      return new int []{-1,-1};
  }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 22;

        int [] result = findTarget(nums,target);
        System.out.println(result[0]+ " "+ result[1]);

        }
}
