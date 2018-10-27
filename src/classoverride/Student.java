package classoverride;

/**
 * @author Liaohaibo
 * @date 2018/10/27 下午11:22
 */
public class Student extends Person{

    private int score;


    /**
     * Student 子类的构造方法
     * 由于父类没有默认的构造方法，就是 public Person() {}
     * 所以子类必须显示的使用构造方法，并将父类构造方法所需的参数 通过super()调用
     * @param name
     */

    public Student(String name) {
        super(name);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Override
     * 1. 子类覆写父类的方法
     * 2. 方法签名如果不同，就不是Override，而是创建了一个新方法，例如参数不同等
     * 3. 使用@Override可以让编译器帮助检查是否进行了正确的覆写
     * 4. @Override不是必须的
     */

    @Override
    public void run() {
        System.out.println("Student " + getName() + " is running");
    }

    /**
     * Java 多态
     *
     *  Person p = new Person("xiaoMing");
     *  Person s = new Student("xiaoStu");          // s: 声明类型Person，实际类型Student
     *  p.run();
     *  s.run();
     *
     *  1. 多态是指针对某个类型的方法调用，其真正执行的方法是取决于运行时实际类型的方法
     *  2. 对某个类型调用方法，执行的方法可能是某个子类覆写方法
     *  3. 利用多态，允许添加更多类型的子类实现功能扩展
     */

    @Override
    public String hello() {

        // super可以调用父类Person被覆写的hello()方法
        return super.hello() + " Student覆写!";
    }
}
