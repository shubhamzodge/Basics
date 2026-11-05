package OptionalClass;
//optional.of()
import javax.swing.text.html.Option;
import java.util.Optional;

public class Option2 {
    public static void main(String[] args) {
        Optional<String > ops = Optional.of("shubh");
        System.out.println(ops);
        System.out.println(ops.get());
    }
}
