package ExceptionHandling;

public class PasswordChecking {
    public static void main(String [] args){
        String correctPassword = "Java@123";
        String givenPassword ="Shubham";
        try {
            if (givenPassword.equals(correctPassword)) {
                System.out.println("Login successful");
            } else {
                throw new Exception("Password does not Matches");
            }
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("This is the End");
    }

}
