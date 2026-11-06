package OptionalClass;

import java.util.Optional;

public class Option5 {
    //static  String name = "Pune";
    static  String name ;

    public static void main(String[] args) {
        Optional<String>ops = Optional.ofNullable(name);
        System.out.println(ops);

        if(ops.isEmpty()){
            System.out.println("No such a value");
        }
        else{
            System.out.println(ops.get());
        }
    }
}
