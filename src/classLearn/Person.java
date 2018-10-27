package classLearn;

/**
 * @author Liaohaibo
 * @date 2018/10/27 下午9:48
 */
public class Person {

    /**
     *  初始化顺序
     *  1.先初始化字段，例如 private String name = "XiaoMing"
     *  2.没有赋值的字段初始化为默认值：基本类型=0,引用类型=null，例如String 引用类型 Int 基本类型
     *  3.再执行构造方法
     */

    /**
     * 1. private 私有的，只能在本类中访问，子类也不行。本类的实例变量可以通过Public的get方法访问到
     * 2. protected 受保护的，子类可以访问 this.name
     * 3. public 公有的，都可以访问，实例变量可以通过person.name = 赋值修改
     */
    protected String name;

    private int age;

    /**
     * 构造方法，使用new操作时调用
     * 1. 可以设置多个构造方法，编译器通过构造方法的参数的数量、位置和类型区分
     * 2. 没有构造方法，会默认生成一个 就是 public Person() {}
     * 3. 一个构造方法能够调用别的构造方法，调用的形式为：this(...) ...是某个构造方法的参数 目的：便于方法的复用
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    public Person() {
        this("unnamed",18);         // 调用构造方法 public Person(String name,int age)
    }

    public String getName() {
        return name;
    }

    /**
     * 方法的重载:
     * 1. 方法名相同
     * 2. 参数不同：个数、类型、位置不同
     * 3. 方法发返回值通常都是相同的
     *
     * 方法重载的目的:
     * 1. 相同的功能使用同一个目的
     * 2. 便于调用
     */
    public void setName(String name) {
        name = "xiaoming";                  // setName 重新赋值name参数，并不会改变Main中调用传入的参数
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        name = firstName + " " + lastName;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int calcBirth(int currentYear) {
        return currentYear - this.age;
    }

    public int getBirth() {
        return calcBirth(2016);
    }

    public String run() {
        return this.name + " is running";
    }
}
