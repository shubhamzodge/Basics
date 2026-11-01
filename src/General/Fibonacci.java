package General;
//print first 5 fiboNumbers;

public class Fibonacci {
    public static int printFibo(int num){
        if(num<=0){
            return 0;
        }
        int a=0,b=1;
        System.out.print(a+ " ");
        for(int i=1;i<num;i++){
            System.out.print(b+" ");
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String [] args){
        printFibo(5);
    }
}
