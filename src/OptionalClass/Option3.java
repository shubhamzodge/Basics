package OptionalClass;

import java.util.Optional;

//optional.ofNullable()
public class Option3 {
    public static void main(String[] args) {
        Optional<String>ops = Optional.ofNullable(null);
        System.out.println(ops);
    }
}
