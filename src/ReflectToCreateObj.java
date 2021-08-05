public class ReflectToCreateObj {
    public static void main(String[] args) {
        MyClass myClass = null;

        try {
            Class clazz = Class.forName(MyClass.class.getName());
            myClass = (MyClass) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(myClass);
    }
}
