package Basics;
//count integers with even digit sum;
public class Count {
    public static int countEven(int num){
        int count =0;


        for(int j=1;j<=num;j++) {
            int sum = 0;
            int temp = j;
            while (temp > 0) {
                sum += (temp % 10);
                temp /= 10;
            }

            if (sum % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        System.out.println(countEven(30));
    }


}
