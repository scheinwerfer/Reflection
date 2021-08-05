import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreateObjWithConstructor {
    public static void main(String[] args) {
        MyClass myClass = null;

        try {
            Class clazz = Class.forName(MyClass.class.getName());
            Class[] params = {int.class, String.class};
            myClass = (MyClass) clazz.getConstructor(params).newInstance(1, "Liza");
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
