import java.lang.reflect.Constructor;

public class GetConstructor {
    // получить объект класса, а затем параметры его конструктора
    // попробовать получить доступ к приватному классу

    public static void main(String[] args) {
        MyClass myClass = null;

        try {
            Class clazz = Class.forName(MyClass.class.getName());
            Class[] params = new Class[] {int.class, String.class};
            myClass = (MyClass) clazz.newInstance();
            Constructor[] constructors = clazz.getConstructors();
            for (Constructor constructor : constructors) {
                Class[] paramTypes = constructor.getParameterTypes();
                for (Class paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");
                }
                System.out.println();
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
