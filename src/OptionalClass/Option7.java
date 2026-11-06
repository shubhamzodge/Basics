package OptionalClass;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Option7 {
    public static void main(String[] args) {


        Optional<String> ops = Optional.ofNullable(null);

        Optional<String> ops2 = ops.or(() -> {
            return Optional.ofNullable("mumbai");
        });
        System.out.println(ops2);
    }
}