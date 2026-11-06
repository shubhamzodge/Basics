package OptionalClass;

//import com.sun.jdi.Method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Optionn9 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls=Class.forName("OptionalClass.Demo");
        Method m =cls.getDeclaredMethod("Displaying");
        m.setAccessible(true);
        m.invoke(null);

    }
}
class Demo{
    private static void Displaying(){
        System.out.println("Displaying");
    }
}
