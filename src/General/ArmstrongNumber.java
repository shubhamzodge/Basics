package General;
//check whether perticular num is armstrong number or not
public class ArmstrongNumber {
    public static void main(String [] args){
        int num = 153;
        int original = num;
        int sum =0;
        int digits = String.valueOf(num).length();
        //String.valueOf(153) → "153"
        //"153".length()    → 3

        while(num>0){
            int digit = num%10;
            sum += (int) Math.pow(digit,digits);
            //Math.pow(3, 3)
            //= 3³
            //= 27
            num/=10;
        }
        if(sum ==original){
            System.out.println(original +" is a armstrong number");
        }else{
            System.out.println(original +" is not a armstrong number");
        }
    }
}
