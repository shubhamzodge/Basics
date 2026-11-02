package ExceptionHandling;

public class NumberChecking {
    public static void main(String[] args) {

        int num = 101;
        try {
            if(num %2 ==0 && num%3 ==0){
                System.out.println(num+" is a super number");
            }
            else{
                throw new Exception("num is not divisible by them and it is not super number");
            }
        } catch (Exception e) {
            System.out.println("Exception "+e.getMessage());
        }
    }
}