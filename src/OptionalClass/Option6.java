package OptionalClass;

import java.util.Optional;

public class Option6 {
    public static void main(String[] args) {
        Optional<String > ops = Optional.ofNullable("Pune");

        ops.ifPresentOrElse((t)->{
            System.out.println(t.toUpperCase());},()->{
                System.out.println("Default value");
            });

    }
}
