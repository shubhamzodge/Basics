package General;

public class StrReverse {
    public static void main(String[] args){
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
