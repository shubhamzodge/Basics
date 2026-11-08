package Multithreading;

public class Multi3 {
    public static void main(String[] args) {
        int num= 0;
        for(int i=1;i<=50000;i++){
            num++;
    }
        for(int i=1;i<=50000;i++){
            num++;
        }
        System.out.println(num);
}


}
