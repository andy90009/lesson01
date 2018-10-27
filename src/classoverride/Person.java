package classoverride;

/**
 * @author Liaohaibo
 * @date 2018/10/27 下午11:21
 */
public class Person {

    private String name;

    private int age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 该方法不能被覆写Override
    public final void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(this.name + " is running");
    }

    //覆写Object类中的 toString()方法
    @Override
    public String toString() {
        return "Person- " + this.name;
    }

    public String hello() {
        return "Hello, " + this.name;
    }

    /**
     *  final 关键字
     * 1. 用final修饰的方法不能被覆写
     * 2. final修饰的类不能被继承
     * 3. 用final修饰的字段在初始化后，不能被修改
     */

}

