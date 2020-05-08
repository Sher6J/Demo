package cn.sher6j.corejava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author sher6j
 * @create 2020-05-06-22:23
 */
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String name = "java.lang.Double";

        Class aClass = Class.forName(name);

        printFields(aClass);
        printConstructors(aClass);
        printMethods(aClass);

    }


    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.println("    ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }

    /**
     * 打印类的构造器
     * @param cl 类
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            //获取构造器的函数名称
            String name = c.getName();
            System.out.print("    ");
            //获取限定符public, private, protected
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            //获取形参类型
            Class[] parameterTypes = c.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                //形参名称
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");

        }
    }

    /**
     * 打印类的方法
     * @param cl 类
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods) {
            Class returnType = m.getReturnType();
            String name = m.getName();

            System.out.println("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(returnType.getName() + " " + name + "(");

            Class[] parameterTypes = m.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                //形参名称
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");
        }
    }
}
