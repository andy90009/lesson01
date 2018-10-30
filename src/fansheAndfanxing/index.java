package fansheAndfanxing;

import java.lang.reflect.Field;

/**
 * @author Liaohaibo
 * @date 2018/10/29 下午4:14
 *
 */
public class index {

    /**
     *  Class类
     *  1. Java除了基本类型外都是class类型（包括interface），例如：String,Object,Runnable,Exception
     *
     *  2. class(包括interface)，它的本质就是数据类型
     *
     *  3. 没有继承关系的数据类型，是无法赋值的：
     *     String s = new Double(123.456) 编译器报错
     *
     *  4. class/interface的数据类型就是Class，每加载一个class,JVM就会为其创建一个CLass类型的实例，并关联起来。
     *     加载String类：首先读取String.class文件；
     *     然后为String类创建一个Class实例： Class cls = new Class(String);  // 演示代码
     *     因此，JVM持有的每个Class实例都指向一个数据类型（class或interface）；
     *     一个Class实例本身包含了该class的完整信息：类名，包名，super，interface，field，method等
     *
     *  5. JVM为每个加载class创建对应的Class实例，并在实例中保存该class的所有信息
     *
     *  6. 如果获取了某个Class实例，则可以获取到该实例对应的class的所有信息
     *
     *  7. 通过Class实例获取对应class信息的方法称为反射（Reflection）
     *
     */

    /**
     *  如何获取一个class的Class实例呢？
     *  1. Type.class
     *     Class cls = String.class;
     *
     *  2. getClass()
     *     String s = "hello";
     *     Class cls = s.getClass();
     *
     *  3. Class.forName
     *     Class cls = Class.forName("java.lang.String");
     */

    /**
     *  反射的目的？
     *  反射的目的是当获得某个Object实例时，我们可以获取该Object的class信息
     */



    public static void main(String[] args) {

        /**
         *  从Class实例中获取class信息：
         *  1. getName()
         *  2. getSimpleName()
         *  3. getPackage()
         */

        Class cls = String.class;

        String fname = cls.getName();           // java.lang.String
        String sname = cls.getSimpleName();     // String
        Package pkg =  cls.getPackage();        // java.lang

        /**
         *  从Class实例判断class类型
         *  1. isInterface()
         *  2. isEnum()
         *  3. isArray()
         *  3. isPrimitive()    是否是基础数据类型
         */
        System.out.println(Runnable.class.isInterface());
        System.out.println(java.time.Month.class.isEnum());
        System.out.println(String[] .class.isArray());
        System.out.println(int.class.isPrimitive());

        /**
         *  从Class实例获取field信息
         *  1. getField(name): 获取某个public的field（包括父类）
         *  2. getDeclaredField(name): 获取当前类的某个field(不包括父类)
         *  3. getFields(): 获取所有public的field(包括父类)
         *  4. getDeclaredFields(): 获取当前类的所有field(不包括父类)
         */

        /**
         *  Field对象包含一个field的所有信息
         *  1. getName()
         *  2. getType()
         *  3. getModifiers()       获得修饰符 public private protected
         */
        Integer n = new Integer(123);
        Class cls1 = n.getClass();
//        Field[] fs = cls.getDeclaredFields();
//        for (Field f : fs) {
//            System.out.println(f.getName());
//            System.out.println(f.getType());
//            System.out.println(f.getModifiers());
//        }



    }

}
