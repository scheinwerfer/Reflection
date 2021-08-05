/*
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void printData(Object myClass) {
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        String name = null;
        int number = myClass.getNumber();
        printData(myClass);

        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(myClass, "Vladislav");
            name = (String) field.get(myClass);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        printData(myClass);
    }
}
*/
