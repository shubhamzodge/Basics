package General;
//encapsulation
import java.util.HashSet;
//code for Encapsulation
class programmer{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class Demmo1{
    public static void main(String [] args){
        programmer obj = new programmer();
        obj.setName("kalu");
        System.out.println(obj.getName());
    }
}